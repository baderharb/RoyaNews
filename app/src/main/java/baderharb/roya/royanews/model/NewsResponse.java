package baderharb.roya.royanews.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsResponse {
    @Expose
    @SerializedName("breaking_news")
    private List<Breaking_news> breaking_news;
    @Expose
    @SerializedName("special_events")
    private List<Special_events> special_events;
    @Expose
    @SerializedName("surveys")
    private List<String> surveys;
    @Expose
    @SerializedName("section_info")
    private List<Section_info> section_info;

    public List<Breaking_news> getBreaking_news() {
        return breaking_news;
    }

    public void setBreaking_news(List<Breaking_news> breaking_news) {
        this.breaking_news = breaking_news;
    }

    public List<Special_events> getSpecial_events() {
        return special_events;
    }

    public void setSpecial_events(List<Special_events> special_events) {
        this.special_events = special_events;
    }

    public List<String> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<String> surveys) {
        this.surveys = surveys;
    }

    public List<Section_info> getSection_info() {
        return section_info;
    }

    public void setSection_info(List<Section_info> section_info) {
        this.section_info = section_info;
    }

    public class Breaking_news {
        @Expose
        @SerializedName("createdDate")
        private String createdDate;
        @Expose
        @SerializedName("breaking_updatedstamp")
        private int breaking_updatedstamp;
        @Expose
        @SerializedName("breaking_createdstamp")
        private int breaking_createdstamp;
        @Expose
        @SerializedName("breaking_news_views")
        private int breaking_news_views;
        @Expose
        @SerializedName("breaking_news_active")
        private int breaking_news_active;
        @Expose
        @SerializedName("breaking_news_title")
        private String breaking_news_title;
        @Expose
        @SerializedName("breaking_news_id")
        private int breaking_news_id;
        @Expose
        @SerializedName("updated_at")
        private String updated_at;
        @Expose
        @SerializedName("created_at")
        private String created_at;
        @Expose
        @SerializedName("views")
        private int views;
        @Expose
        @SerializedName("active")
        private int active;
        @Expose
        @SerializedName("notifiable")
        private int notifiable;
        @Expose
        @SerializedName("news_id")
        private int news_id;
        @Expose
        @SerializedName("title")
        private String title;
        @Expose
        @SerializedName("id")
        private int id;

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public int getBreaking_updatedstamp() {
            return breaking_updatedstamp;
        }

        public void setBreaking_updatedstamp(int breaking_updatedstamp) {
            this.breaking_updatedstamp = breaking_updatedstamp;
        }

        public int getBreaking_createdstamp() {
            return breaking_createdstamp;
        }

        public void setBreaking_createdstamp(int breaking_createdstamp) {
            this.breaking_createdstamp = breaking_createdstamp;
        }

        public int getBreaking_news_views() {
            return breaking_news_views;
        }

        public void setBreaking_news_views(int breaking_news_views) {
            this.breaking_news_views = breaking_news_views;
        }

        public int getBreaking_news_active() {
            return breaking_news_active;
        }

        public void setBreaking_news_active(int breaking_news_active) {
            this.breaking_news_active = breaking_news_active;
        }

        public String getBreaking_news_title() {
            return breaking_news_title;
        }

        public void setBreaking_news_title(String breaking_news_title) {
            this.breaking_news_title = breaking_news_title;
        }

        public int getBreaking_news_id() {
            return breaking_news_id;
        }

        public void setBreaking_news_id(int breaking_news_id) {
            this.breaking_news_id = breaking_news_id;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public int getActive() {
            return active;
        }

        public void setActive(int active) {
            this.active = active;
        }

        public int getNotifiable() {
            return notifiable;
        }

        public void setNotifiable(int notifiable) {
            this.notifiable = notifiable;
        }

        public int getNews_id() {
            return news_id;
        }

        public void setNews_id(int news_id) {
            this.news_id = news_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public class Special_events {
        @Expose
        @SerializedName("event_topbar_text")
        private String event_topbar_text;
        @Expose
        @SerializedName("event_title")
        private String event_title;
        @Expose
        @SerializedName("event_id")
        private int event_id;

        public String getEvent_topbar_text() {
            return event_topbar_text;
        }

        public void setEvent_topbar_text(String event_topbar_text) {
            this.event_topbar_text = event_topbar_text;
        }

        public String getEvent_title() {
            return event_title;
        }

        public void setEvent_title(String event_title) {
            this.event_title = event_title;
        }

        public int getEvent_id() {
            return event_id;
        }

        public void setEvent_id(int event_id) {
            this.event_id = event_id;
        }
    }

    public class Section_info {
        @Expose
        @SerializedName("section")
        private Section section;
        @Expose
        @SerializedName("news_link")
        private String news_link;
        @Expose
        @SerializedName("news_section")
        private String news_section;
        @Expose
        @SerializedName("createdDate")
        private String createdDate;
        @Expose
        @SerializedName("updatedstamp")
        private boolean updatedstamp;
        @Expose
        @SerializedName("createdstamp")
        private int createdstamp;
        @Expose
        @SerializedName("imageLink")
        private String imageLink;
        @Expose
        @SerializedName("main_image_path")
        private String main_image_path;
        @Expose
        @SerializedName("created_age")
        private String created_age;
        @Expose
        @SerializedName("section_name")
        private String section_name;
        @Expose
        @SerializedName("section_id")
        private int section_id;
        @Expose
        @SerializedName("image")
        private String image;
        @Expose
        @SerializedName("created_at")
        private String created_at;
        @Expose
        @SerializedName("news_title")
        private String news_title;
        @Expose
        @SerializedName("news_id")
        private int news_id;

        public Section getSection() {
            return section;
        }

        public void setSection(Section section) {
            this.section = section;
        }

        public String getNews_link() {
            return news_link;
        }

        public void setNews_link(String news_link) {
            this.news_link = news_link;
        }

        public String getNews_section() {
            return news_section;
        }

        public void setNews_section(String news_section) {
            this.news_section = news_section;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public boolean getUpdatedstamp() {
            return updatedstamp;
        }

        public void setUpdatedstamp(boolean updatedstamp) {
            this.updatedstamp = updatedstamp;
        }

        public int getCreatedstamp() {
            return createdstamp;
        }

        public void setCreatedstamp(int createdstamp) {
            this.createdstamp = createdstamp;
        }

        public String getImageLink() {
            return imageLink;
        }

        public void setImageLink(String imageLink) {
            this.imageLink = imageLink;
        }

        public String getMain_image_path() {
            return main_image_path;
        }

        public void setMain_image_path(String main_image_path) {
            this.main_image_path = main_image_path;
        }

        public String getCreated_age() {
            return created_age;
        }

        public void setCreated_age(String created_age) {
            this.created_age = created_age;
        }

        public String getSection_name() {
            return section_name;
        }

        public void setSection_name(String section_name) {
            this.section_name = section_name;
        }

        public int getSection_id() {
            return section_id;
        }

        public void setSection_id(int section_id) {
            this.section_id = section_id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getNews_title() {
            return news_title;
        }

        public void setNews_title(String news_title) {
            this.news_title = news_title;
        }

        public int getNews_id() {
            return news_id;
        }

        public void setNews_id(int news_id) {
            this.news_id = news_id;
        }
    }

    public class Section {
        @Expose
        @SerializedName("description")
        private String description;
        @Expose
        @SerializedName("ads_code")
        private String ads_code;
        @Expose
        @SerializedName("alias_en")
        private String alias_en;
        @Expose
        @SerializedName("alias_ar")
        private String alias_ar;
        @Expose
        @SerializedName("thumbs_images")
        private int thumbs_images;
        @Expose
        @SerializedName("order")
        private int order;
        @Expose
        @SerializedName("show_in_app")
        private int show_in_app;
        @Expose
        @SerializedName("show_in_homepage")
        private int show_in_homepage;
        @Expose
        @SerializedName("name")
        private String name;
        @Expose
        @SerializedName("id")
        private int id;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAds_code() {
            return ads_code;
        }

        public void setAds_code(String ads_code) {
            this.ads_code = ads_code;
        }

        public String getAlias_en() {
            return alias_en;
        }

        public void setAlias_en(String alias_en) {
            this.alias_en = alias_en;
        }

        public String getAlias_ar() {
            return alias_ar;
        }

        public void setAlias_ar(String alias_ar) {
            this.alias_ar = alias_ar;
        }

        public int getThumbs_images() {
            return thumbs_images;
        }

        public void setThumbs_images(int thumbs_images) {
            this.thumbs_images = thumbs_images;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getShow_in_app() {
            return show_in_app;
        }

        public void setShow_in_app(int show_in_app) {
            this.show_in_app = show_in_app;
        }

        public int getShow_in_homepage() {
            return show_in_homepage;
        }

        public void setShow_in_homepage(int show_in_homepage) {
            this.show_in_homepage = show_in_homepage;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
