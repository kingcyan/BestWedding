package com.qf.entity;

import java.util.List;

/**
 * Created by King
 * 2016/8/22
 */
public class BrideEntity {




    private DataBean data;


    private int current_time;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(int current_time) {
        this.current_time = current_time;
    }

    public static class DataBean {


        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {


            private EntityBean entity;

            public EntityBean getEntity() {
                return entity;
            }

            public void setEntity(EntityBean entity) {
                this.entity = entity;
            }

            public static class EntityBean {
                private String title;
                private int post_count;


                private PostBean post;
                private String author_nick;


                private CommunityChannelBean community_channel;
                private Object pages;
                private int is_praised;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getPost_count() {
                    return post_count;
                }

                public void setPost_count(int post_count) {
                    this.post_count = post_count;
                }

                public PostBean getPost() {
                    return post;
                }

                public void setPost(PostBean post) {
                    this.post = post;
                }

                public String getAuthor_nick() {
                    return author_nick;
                }

                public void setAuthor_nick(String author_nick) {
                    this.author_nick = author_nick;
                }

                public CommunityChannelBean getCommunity_channel() {
                    return community_channel;
                }

                public void setCommunity_channel(CommunityChannelBean community_channel) {
                    this.community_channel = community_channel;
                }

                public Object getPages() {
                    return pages;
                }

                public void setPages(Object pages) {
                    this.pages = pages;
                }

                public int getIs_praised() {
                    return is_praised;
                }

                public void setIs_praised(int is_praised) {
                    this.is_praised = is_praised;
                }

                public static class PostBean {
                    private String message;
                    private int praised_count;
                    /**
                     * kind : 2
                     * path : http://qnm.hunliji.com/FjvYqesfACV3nWI_iFTv7up5m9go
                     * width : 1334
                     * height : 892
                     * mediable_id : 2674392
                     */

                    private List<PicsBean> pics;
                    /**
                     * id : 1582421
                     * description : null
                     * kind : 2
                     * path : http://qnm.hunliji.com/FjvYqesfACV3nWI_iFTv7up5m9go
                     * width : 1334
                     * height : 892
                     * persistent_id : null
                     * persistent_path : null
                     * mediable_id : 2674392
                     * mediable_type : CommunityPost
                     */

                    private List<MediaItemsBean> media_items;

                    public String getMessage() {
                        return message;
                    }

                    public void setMessage(String message) {
                        this.message = message;
                    }

                    public int getPraised_count() {
                        return praised_count;
                    }

                    public void setPraised_count(int praised_count) {
                        this.praised_count = praised_count;
                    }

                    public List<PicsBean> getPics() {
                        return pics;
                    }

                    public void setPics(List<PicsBean> pics) {
                        this.pics = pics;
                    }

                    public List<MediaItemsBean> getMedia_items() {
                        return media_items;
                    }

                    public void setMedia_items(List<MediaItemsBean> media_items) {
                        this.media_items = media_items;
                    }

                    public static class PicsBean {
                        private String path;

                        public String getPath() {
                            return path;
                        }

                        public void setPath(String path) {
                            this.path = path;
                        }
                    }

                    public static class MediaItemsBean {
                        private String path;

                        public String getPath() {
                            return path;
                        }

                        public void setPath(String path) {
                            this.path = path;
                        }
                    }
                }

                public static class CommunityChannelBean {
                    private String cover_path;
                    private String user_id;
                    private String deleted;

                    public String getCover_path() {
                        return cover_path;
                    }

                    public void setCover_path(String cover_path) {
                        this.cover_path = cover_path;
                    }

                    public String getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(String user_id) {
                        this.user_id = user_id;
                    }

                    public String getDeleted() {
                        return deleted;
                    }

                    public void setDeleted(String deleted) {
                        this.deleted = deleted;
                    }
                }
            }
        }
    }
}
