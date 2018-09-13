package com.test.mtom;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UploadService {
   void uploadFile(@WebParam(name = "file") FileUploader file);
}