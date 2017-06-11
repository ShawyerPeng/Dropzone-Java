package service;

import po.Image;

import java.util.List;

public interface FileUploadService {
    List<Image> listFiles();

    Image getFile(Integer id);

    Image saveFile(Image image);
}
