package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping
public class NoDbController {
    @RequestMapping(value = "/upload2", method = RequestMethod.POST)
    public ResponseEntity uploadFile(HttpServletRequest request, MultipartFile file) throws IOException {
        String mimeType = file.getContentType();
        String filename = file.getOriginalFilename();
        byte[] bytes = file.getBytes();
        String last=filename.substring(filename.lastIndexOf("."));
        // String uploads = request.getSession().getServletContext().getRealPath("uploads");
        // FileOutputStream out = new FileOutputStream(new File(uploads + File.separator + file.getName()+System.currentTimeMillis()+ last));
        FileOutputStream out = new FileOutputStream(new File("D://imgs" + File.separator + file.getName()+System.currentTimeMillis() + last));
        FileCopyUtils.copy(bytes, out);
        out.close();
        return new ResponseEntity<>("{}", HttpStatus.OK);
    }
}
