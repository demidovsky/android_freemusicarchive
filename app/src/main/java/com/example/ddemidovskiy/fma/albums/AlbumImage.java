
package com.example.ddemidovskiy.fma.albums;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AlbumImage {

    @SerializedName("image_id")
    @Expose
    private String imageId;
    @SerializedName("user_id")
    @Expose
    private Object userId;
    @SerializedName("artist_id")
    @Expose
    private Object artistId;
    @SerializedName("album_id")
    @Expose
    private String albumId;
    @SerializedName("curator_id")
    @Expose
    private Object curatorId;
    @SerializedName("image_file")
    @Expose
    private String imageFile;
    @SerializedName("image_title")
    @Expose
    private String imageTitle;
    @SerializedName("image_caption")
    @Expose
    private String imageCaption;
    @SerializedName("image_copyright")
    @Expose
    private Object imageCopyright;
    @SerializedName("image_source")
    @Expose
    private Object imageSource;
    @SerializedName("image_order")
    @Expose
    private String imageOrder;

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
     *     The userId
     */
    public Object getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The artistId
     */
    public Object getArtistId() {
        return artistId;
    }

    /**
     * 
     * @param artistId
     *     The artist_id
     */
    public void setArtistId(Object artistId) {
        this.artistId = artistId;
    }

    /**
     * 
     * @return
     *     The albumId
     */
    public String getAlbumId() {
        return albumId;
    }

    /**
     * 
     * @param albumId
     *     The album_id
     */
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    /**
     * 
     * @return
     *     The curatorId
     */
    public Object getCuratorId() {
        return curatorId;
    }

    /**
     * 
     * @param curatorId
     *     The curator_id
     */
    public void setCuratorId(Object curatorId) {
        this.curatorId = curatorId;
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
    public String getImageCaption() {
        return imageCaption;
    }

    /**
     * 
     * @param imageCaption
     *     The image_caption
     */
    public void setImageCaption(String imageCaption) {
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

    /**
     * 
     * @return
     *     The imageOrder
     */
    public String getImageOrder() {
        return imageOrder;
    }

    /**
     * 
     * @param imageOrder
     *     The image_order
     */
    public void setImageOrder(String imageOrder) {
        this.imageOrder = imageOrder;
    }

}
