package com.embarkx.FirstSpring;

public class HelloResponse {
    private  String message;

  public HelloResponse(String message){
      this.message=message;
  }

    public String setMessage(){
        return  message;
    }
    public String  getMessage(){
        return setMessage();
    }

}
