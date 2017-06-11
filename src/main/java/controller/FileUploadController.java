package controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import po.Image;
import service.FileUploadService;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping
public class FileUploadController {
    @Autowired
    private FileUploadService uploadService;

    String url;

    @RequestMapping("/")
    public String home() {
        return "/fileUploader.jsp";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody List<Image> upload(MultipartHttpServletRequest request, HttpServletResponse response) throws IOException {
        // 从请求中获取文件
        Map<String, MultipartFile> fileMap = request.getFileMap();

        // 维持一个list以发送文件信息到后台
        List<Image> uploadedFiles = new ArrayList<Image>();

        for (MultipartFile multipartFile : fileMap.values()) {
            saveFileToLocalDisk(multipartFile);
            Image fileInfo = getUploadedFileInfo(multipartFile);
            fileInfo = saveFileToDatabase(fileInfo);
            uploadedFiles.add(fileInfo);
        }
        return uploadedFiles;
    }

    @RequestMapping(value = {"/list"})
    public String listBooks(Map<String, Object> map) {
        map.put("fileList", uploadService.listFiles());
        return "/listFiles";
    }

    @RequestMapping(value = "/get/{fileId}", method = RequestMethod.GET)
    public void getFile(HttpServletResponse response, @PathVariable Integer fileId) {
        Image dataFile = uploadService.getFile(fileId);
        File file = new File(dataFile.getIurl(), dataFile.getIname());
        try {
          response.setContentType(dataFile.getItype());
          response.setHeader("Content-disposition", "attachment; filename=\"" + dataFile.getIname() + "\"");
          FileCopyUtils.copy(FileUtils.readFileToByteArray(file), response.getOutputStream());
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

    private void saveFileToLocalDisk(MultipartFile multipartFile) throws IOException {
        String outputFileName = getOutputFilename(multipartFile);
        FileCopyUtils.copy(multipartFile.getBytes(), new FileOutputStream(outputFileName));
    }

    private Image saveFileToDatabase(Image image) {
        return uploadService.saveFile(image);
    }

    private String getOutputFilename(MultipartFile multipartFile) {
        int rannum = (int) ((new Random()).nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        // url = getDestinationLocation() + UUID.randomUUID().toString().replace("-","") + "_" + multipartFile.getOriginalFilename();
        url = getDestinationLocation() + System.currentTimeMillis() + "_" + multipartFile.getOriginalFilename();
        return url;
    }

    private Image getUploadedFileInfo(MultipartFile multipartFile) throws IOException {
        Image fileInfo = new Image();
        fileInfo.setIname(multipartFile.getOriginalFilename());
        fileInfo.setIsize(multipartFile.getSize());
        fileInfo.setItype(multipartFile.getContentType());
        fileInfo.setIurl(url);
        return fileInfo;
    }

    private String getDestinationLocation() {
        return "D:\\imgs\\";
    }
}
