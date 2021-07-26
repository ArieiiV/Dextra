package br.com.marvel.api;

@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
