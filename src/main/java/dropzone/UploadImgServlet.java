// package dropzone;
//
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.util.FileCopyUtils;
//
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
//
// @WebServlet("/upload")
// public class UploadImgServlet extends HttpServlet {
//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         String mimeType = file.getContentType();
//         String filename = file.getOriginalFilename();
//         byte[] bytes = file.getBytes();
//         String last=filename.substring(filename.lastIndexOf("."));
//         String uploads = request.getSession().getServletContext().getRealPath("uploads");
//         FileOutputStream out = new FileOutputStream(new File(uploads + File.separator + file.getName()+System.currentTimeMillis()+ last));
//         FileCopyUtils.copy(bytes, out);
//         return new ResponseEntity<>("{}", HttpStatus.OK);
//     }
//
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//     }
// }
