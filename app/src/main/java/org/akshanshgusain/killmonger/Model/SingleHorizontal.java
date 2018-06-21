package org.akshanshgusain.killmonger.Model;

public class SingleHorizontal {
    private int images;
    private String title;
    private String desc;
    private String pubDate;

    //Default Constructor 1
    public SingleHorizontal() {

    }
   // Parameterized Constructor
    public SingleHorizontal(int images, String title, String desc, String pubDate) {
        this.images = images;
        this.title = title;
        this.desc = desc;
        this.pubDate = pubDate;
    }
                     //PubDate Getter and Setter
                       public String getPubDate() {
                                  return pubDate;
                                   }

                        public void setPubDate(String pubDate) {
                                   this.pubDate = pubDate;
                                   }

    //Desc Getter nad Setter
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    //Image Getter and Setter
    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

                                       //Title Getter and setter
                                       public String getTitle() {
                                              return title;
                                                }

                                       public void setTitle(String title) {
                                               this.title = title;
                                                }

}
