
package com.example.ddemidovskiy.fma.albums;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Dataset {

    @SerializedName("album_id")
    @Expose
    private String albumId;
    @SerializedName("album_title")
    @Expose
    private String albumTitle;
    @SerializedName("album_handle")
    @Expose
    private String albumHandle;
    @SerializedName("album_url")
    @Expose
    private String albumUrl;
    @SerializedName("album_type")
    @Expose
    private String albumType;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("artist_url")
    @Expose
    private String artistUrl;
    @SerializedName("album_producer")
    @Expose
    private Object albumProducer;
    @SerializedName("album_engineer")
    @Expose
    private Object albumEngineer;
    @SerializedName("album_information")
    @Expose
    private String albumInformation;
    @SerializedName("album_date_released")
    @Expose
    private Object albumDateReleased;
    @SerializedName("album_comments")
    @Expose
    private String albumComments;
    @SerializedName("album_favorites")
    @Expose
    private String albumFavorites;
    @SerializedName("album_tracks")
    @Expose
    private String albumTracks;
    @SerializedName("album_listens")
    @Expose
    private String albumListens;
    @SerializedName("album_date_created")
    @Expose
    private String albumDateCreated;
    @SerializedName("album_image_file")
    @Expose
    private String albumImageFile;
    @SerializedName("album_images")
    @Expose
    private List<AlbumImage> albumImages = new ArrayList<AlbumImage>();
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();

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
     *     The albumTitle
     */
    public String getAlbumTitle() {
        return albumTitle;
    }

    /**
     * 
     * @param albumTitle
     *     The album_title
     */
    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    /**
     * 
     * @return
     *     The albumHandle
     */
    public String getAlbumHandle() {
        return albumHandle;
    }

    /**
     * 
     * @param albumHandle
     *     The album_handle
     */
    public void setAlbumHandle(String albumHandle) {
        this.albumHandle = albumHandle;
    }

    /**
     * 
     * @return
     *     The albumUrl
     */
    public String getAlbumUrl() {
        return albumUrl;
    }

    /**
     * 
     * @param albumUrl
     *     The album_url
     */
    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    /**
     * 
     * @return
     *     The albumType
     */
    public String getAlbumType() {
        return albumType;
    }

    /**
     * 
     * @param albumType
     *     The album_type
     */
    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    /**
     * 
     * @return
     *     The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * 
     * @param artistName
     *     The artist_name
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * 
     * @return
     *     The artistUrl
     */
    public String getArtistUrl() {
        return artistUrl;
    }

    /**
     * 
     * @param artistUrl
     *     The artist_url
     */
    public void setArtistUrl(String artistUrl) {
        this.artistUrl = artistUrl;
    }

    /**
     * 
     * @return
     *     The albumProducer
     */
    public Object getAlbumProducer() {
        return albumProducer;
    }

    /**
     * 
     * @param albumProducer
     *     The album_producer
     */
    public void setAlbumProducer(Object albumProducer) {
        this.albumProducer = albumProducer;
    }

    /**
     * 
     * @return
     *     The albumEngineer
     */
    public Object getAlbumEngineer() {
        return albumEngineer;
    }

    /**
     * 
     * @param albumEngineer
     *     The album_engineer
     */
    public void setAlbumEngineer(Object albumEngineer) {
        this.albumEngineer = albumEngineer;
    }

    /**
     * 
     * @return
     *     The albumInformation
     */
    public String getAlbumInformation() {
        return albumInformation;
    }

    /**
     * 
     * @param albumInformation
     *     The album_information
     */
    public void setAlbumInformation(String albumInformation) {
        this.albumInformation = albumInformation;
    }

    /**
     * 
     * @return
     *     The albumDateReleased
     */
    public Object getAlbumDateReleased() {
        return albumDateReleased;
    }

    /**
     * 
     * @param albumDateReleased
     *     The album_date_released
     */
    public void setAlbumDateReleased(Object albumDateReleased) {
        this.albumDateReleased = albumDateReleased;
    }

    /**
     * 
     * @return
     *     The albumComments
     */
    public String getAlbumComments() {
        return albumComments;
    }

    /**
     * 
     * @param albumComments
     *     The album_comments
     */
    public void setAlbumComments(String albumComments) {
        this.albumComments = albumComments;
    }

    /**
     * 
     * @return
     *     The albumFavorites
     */
    public String getAlbumFavorites() {
        return albumFavorites;
    }

    /**
     * 
     * @param albumFavorites
     *     The album_favorites
     */
    public void setAlbumFavorites(String albumFavorites) {
        this.albumFavorites = albumFavorites;
    }

    /**
     * 
     * @return
     *     The albumTracks
     */
    public String getAlbumTracks() {
        return albumTracks;
    }

    /**
     * 
     * @param albumTracks
     *     The album_tracks
     */
    public void setAlbumTracks(String albumTracks) {
        this.albumTracks = albumTracks;
    }

    /**
     * 
     * @return
     *     The albumListens
     */
    public String getAlbumListens() {
        return albumListens;
    }

    /**
     * 
     * @param albumListens
     *     The album_listens
     */
    public void setAlbumListens(String albumListens) {
        this.albumListens = albumListens;
    }

    /**
     * 
     * @return
     *     The albumDateCreated
     */
    public String getAlbumDateCreated() {
        return albumDateCreated;
    }

    /**
     * 
     * @param albumDateCreated
     *     The album_date_created
     */
    public void setAlbumDateCreated(String albumDateCreated) {
        this.albumDateCreated = albumDateCreated;
    }

    /**
     * 
     * @return
     *     The albumImageFile
     */
    public String getAlbumImageFile() {
        return albumImageFile;
    }

    /**
     * 
     * @param albumImageFile
     *     The album_image_file
     */
    public void setAlbumImageFile(String albumImageFile) {
        this.albumImageFile = albumImageFile;
    }

    /**
     * 
     * @return
     *     The albumImages
     */
    public List<AlbumImage> getAlbumImages() {
        return albumImages;
    }

    /**
     * 
     * @param albumImages
     *     The album_images
     */
    public void setAlbumImages(List<AlbumImage> albumImages) {
        this.albumImages = albumImages;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

}
