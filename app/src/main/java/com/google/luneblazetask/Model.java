package com.google.luneblazetask;

public class Model {

   // private String id;
    private String userName;
    private String article;
  //  private String media_type;
    private String media_url;
   // private String Informative;
   // private String thoughts;
   // private String share;
public Model(String userName,String article,String media_url)
{
    this.article = article;
    this.userName = userName;
    this.media_url = media_url;



}


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }


    public String getMedia_url() {
        return media_url;
    }

    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }



}

