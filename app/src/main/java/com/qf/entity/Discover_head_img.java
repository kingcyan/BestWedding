package com.qf.entity;

import java.util.List;

/**
 * Created by King
 * 2016/8/23
 */
public class Discover_head_img {


    /**
     * id : 1018
     * name : 发现页
     * floors : {"SITE_FIND_TOP_BANNER":{"id":"36","name":"发现页顶部banner","style_name":"SITE_FIND_TOP_BANNER","style_image":null,"holes":[{"id":"101","name":"banner02","site_type":"0","posters":{"id":"2123","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/index.php/Home/AppH5/cookie_redirect?url=http://www.hunliji.com/p/wedding/Public/wap/activity/zeroActList.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FtsCElP2-NZuIp08xgi2hsBqJbr-","title":"0元活动","watch_count":"0","is_valid":1}},{"id":"102","name":"banner03","site_type":"0"},{"id":"103","name":"banner04","site_type":"0"},{"id":"104","name":"banner05","site_type":"0"},{"id":"105","name":"banner06","site_type":"0"},{"id":"113","name":"banner01","site_type":"0"}]}}
     */

    private DataBean data;
    /**
     * status : {"RetCode":0,"msg":"success"}
     * data : {"id":"1018","name":"发现页","floors":{"SITE_FIND_TOP_BANNER":{"id":"36","name":"发现页顶部banner","style_name":"SITE_FIND_TOP_BANNER","style_image":null,"holes":[{"id":"101","name":"banner02","site_type":"0","posters":{"id":"2123","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/index.php/Home/AppH5/cookie_redirect?url=http://www.hunliji.com/p/wedding/Public/wap/activity/zeroActList.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FtsCElP2-NZuIp08xgi2hsBqJbr-","title":"0元活动","watch_count":"0","is_valid":1}},{"id":"102","name":"banner03","site_type":"0"},{"id":"103","name":"banner04","site_type":"0"},{"id":"104","name":"banner05","site_type":"0"},{"id":"105","name":"banner06","site_type":"0"},{"id":"113","name":"banner01","site_type":"0"}]}}}
     * current_time : 1471941020
     */

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
        /**
         * SITE_FIND_TOP_BANNER : {"id":"36","name":"发现页顶部banner","style_name":"SITE_FIND_TOP_BANNER","style_image":null,"holes":[{"id":"101","name":"banner02","site_type":"0","posters":{"id":"2123","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/index.php/Home/AppH5/cookie_redirect?url=http://www.hunliji.com/p/wedding/Public/wap/activity/zeroActList.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FtsCElP2-NZuIp08xgi2hsBqJbr-","title":"0元活动","watch_count":"0","is_valid":1}},{"id":"102","name":"banner03","site_type":"0"},{"id":"103","name":"banner04","site_type":"0"},{"id":"104","name":"banner05","site_type":"0"},{"id":"105","name":"banner06","site_type":"0"},{"id":"113","name":"banner01","site_type":"0"}]}
         */

        private FloorsBean floors;

        public FloorsBean getFloors() {
            return floors;
        }

        public void setFloors(FloorsBean floors) {
            this.floors = floors;
        }

        public static class FloorsBean {
            /**
             * id : 36
             * name : 发现页顶部banner
             * style_name : SITE_FIND_TOP_BANNER
             * style_image : null
             * holes : [{"id":"101","name":"banner02","site_type":"0","posters":{"id":"2123","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/index.php/Home/AppH5/cookie_redirect?url=http://www.hunliji.com/p/wedding/Public/wap/activity/zeroActList.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FtsCElP2-NZuIp08xgi2hsBqJbr-","title":"0元活动","watch_count":"0","is_valid":1}},{"id":"102","name":"banner03","site_type":"0"},{"id":"103","name":"banner04","site_type":"0"},{"id":"104","name":"banner05","site_type":"0"},{"id":"105","name":"banner06","site_type":"0"},{"id":"113","name":"banner01","site_type":"0"}]
             */

            private SITEFINDTOPBANNERBean SITE_FIND_TOP_BANNER;

            public SITEFINDTOPBANNERBean getSITE_FIND_TOP_BANNER() {
                return SITE_FIND_TOP_BANNER;
            }

            public void setSITE_FIND_TOP_BANNER(SITEFINDTOPBANNERBean SITE_FIND_TOP_BANNER) {
                this.SITE_FIND_TOP_BANNER = SITE_FIND_TOP_BANNER;
            }

            public static class SITEFINDTOPBANNERBean {
                /**
                 * id : 101
                 * name : banner02
                 * site_type : 0
                 * posters : {"id":"2123","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/index.php/Home/AppH5/cookie_redirect?url=http://www.hunliji.com/p/wedding/Public/wap/activity/zeroActList.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FtsCElP2-NZuIp08xgi2hsBqJbr-","title":"0元活动","watch_count":"0","is_valid":1}
                 */

                private List<HolesBean> holes;

                public List<HolesBean> getHoles() {
                    return holes;
                }

                public void setHoles(List<HolesBean> holes) {
                    this.holes = holes;
                }

                public static class HolesBean {
                    /**
                     * id : 2123
                     * target_type : 9
                     * target_url : http://www.hunliji.com/p/wedding/index.php/Home/AppH5/cookie_redirect?url=http://www.hunliji.com/p/wedding/Public/wap/activity/zeroActList.html?is_app=true
                     * target_id : 0
                     * image_path : http://qnm.hunliji.com/FtsCElP2-NZuIp08xgi2hsBqJbr-
                     * title : 0元活动
                     * watch_count : 0
                     * is_valid : 1
                     */

                    private PostersBean posters;

                    public PostersBean getPosters() {
                        return posters;
                    }

                    public void setPosters(PostersBean posters) {
                        this.posters = posters;
                    }

                    public static class PostersBean {
                        private String target_url;
                        private String image_path;

                        public String getTarget_url() {
                            return target_url;
                        }

                        public void setTarget_url(String target_url) {
                            this.target_url = target_url;
                        }

                        public String getImage_path() {
                            return image_path;
                        }

                        public void setImage_path(String image_path) {
                            this.image_path = image_path;
                        }
                    }
                }
            }
        }
    }
}
