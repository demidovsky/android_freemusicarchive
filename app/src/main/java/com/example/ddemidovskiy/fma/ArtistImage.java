
package com.example.ddemidovskiy.fma;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ArtistImage {

    @SerializedName("image_id")
    @Expose
    private String imageId;
    @SerializedName("image_file")
    @Expose
    private String imageFile;
    @SerializedName("image_title")
    @Expose
    private String imageTitle;
    @SerializedName("image_caption")
    @Expose
    private Object imageCaption;
    @SerializedName("image_copyright")
    @Expose
    private Object imageCopyright;
    @SerializedName("image_source")
    @Expose
    private Object imageSource;

    /**
     * 
     * @return
     *     The imageId
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * 
     * @param imageId
     *     The image_id
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * 
     * @return
     *     The imageFile
     */
    public String getImageFile() {
        return imageFile;
    }

    /**
     * 
     * @param imageFile
     *     The image_file
     */
    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * 
     * @return
     *     The imageTitle
     */
    public String getImageTitle() {
        return imageTitle;
    }

    /**
     * 
     * @param imageTitle
     *     The image_title
     */
    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    /**
     * 
     * @return
     *     The imageCaption
     */
    public Object getImageCaption() {
        return imageCaption;
    }

    /**
     * 
     * @param imageCaption
     *     The image_caption
     */
    public void setImageCaption(Object imageCaption) {
        this.imageCaption = imageCaption;
    }

    /**
     * 
     * @return
     *     The imageCopyright
     */
    public Object getImageCopyright() {
        return imageCopyright;
    }

    /**
     * 
     * @param imageCopyright
     *     The image_copyright
     */
    public void setImageCopyright(Object imageCopyright) {
        this.imageCopyright = imageCopyright;
    }

    /**
     * 
     * @return
     *     The imageSource
     */
    public Object getImageSource() {
        return imageSource;
    }

    /**
     * 
     * @param imageSource
     *     The image_source
     */
    public void setImageSource(Object imageSource) {
        this.imageSource = imageSource;
    }

}
