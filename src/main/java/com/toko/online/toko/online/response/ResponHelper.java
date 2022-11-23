package com.toko.online.toko.online.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponHelper {
    public  static  <T> ResponseEntity<CommonResponse<T>> ok(T data) {
        CommonResponse<T> response = new CommonResponse<>();
        response.setMessage("Sucses");
        response.setStatus("200");
        response.setData(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    public  static  <T> ResponseEntity<CommonResponse<T>> error (String error,HttpStatus httpStatus){
        CommonResponse<T> response = new CommonResponse<>();
        response.setStatus(String.valueOf(httpStatus.value()));
        response.setMessage(httpStatus.name());
        response.setData((T)error);
        return  new ResponseEntity<>(response, httpStatus);
    }
}
