package br.com.marvel.api;

@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
