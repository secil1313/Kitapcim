package com.secil.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    BOOK_NOT_FOUND(2004,"Kitap adı bulunamadı",HttpStatus.NOT_FOUND),
    ERROR_INVALID_TOKEN(3000,"Geçersiz token bilgisi",HttpStatus.UNAUTHORIZED),
    BAD_REQUEST(4000,"Geçersiz istek ya da parametre",HttpStatus.BAD_REQUEST),
    ERROR(9000,"Beklenmeyen bir hata oluştu.Lütfen tekrar deneyiniz.",HttpStatus.INTERNAL_SERVER_ERROR);
    int code;
    String message;
    HttpStatus httpStatus;

}
