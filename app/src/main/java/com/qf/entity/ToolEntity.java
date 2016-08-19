package com.qf.entity;

import java.util.List;

/**
 * Created by King
 * 2016/8/19
 */
public class ToolEntity {


    /**
     * id : 1004
     * name : APP客户端工具页
     * floors : {"TOOLS_BANNER":{"id":"4","name":"工具页banner","style_name":"TOOLS_BANNER","style_image":"http://qnm.hunliji.com/o_1al67d6be1jgu1cbi15491fl91tak11.png","holes":[{"id":"14","name":"banner01","site_type":"0","posters":{"id":"1280","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Tpl/default/home/20160603qtxc.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FrQbtQH25Q3Z9K_p7WLFoBTssysx","title":"工具页banner","watch_count":"0","is_valid":1}}]}}
     */

    private DataBean data;
    /**
     * status : {"RetCode":0,"msg":"success"}
     * data : {"id":"1004","name":"APP客户端工具页","floors":{"TOOLS_BANNER":{"id":"4","name":"工具页banner","style_name":"TOOLS_BANNER","style_image":"http://qnm.hunliji.com/o_1al67d6be1jgu1cbi15491fl91tak11.png","holes":[{"id":"14","name":"banner01","site_type":"0","posters":{"id":"1280","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Tpl/default/home/20160603qtxc.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FrQbtQH25Q3Z9K_p7WLFoBTssysx","title":"工具页banner","watch_count":"0","is_valid":1}}]}}}
     * current_time : 1471605293
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
         * TOOLS_BANNER : {"id":"4","name":"工具页banner","style_name":"TOOLS_BANNER","style_image":"http://qnm.hunliji.com/o_1al67d6be1jgu1cbi15491fl91tak11.png","holes":[{"id":"14","name":"banner01","site_type":"0","posters":{"id":"1280","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Tpl/default/home/20160603qtxc.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FrQbtQH25Q3Z9K_p7WLFoBTssysx","title":"工具页banner","watch_count":"0","is_valid":1}}]}
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
             * id : 4
             * name : 工具页banner
             * style_name : TOOLS_BANNER
             * style_image : http://qnm.hunliji.com/o_1al67d6be1jgu1cbi15491fl91tak11.png
             * holes : [{"id":"14","name":"banner01","site_type":"0","posters":{"id":"1280","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Tpl/default/home/20160603qtxc.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FrQbtQH25Q3Z9K_p7WLFoBTssysx","title":"工具页banner","watch_count":"0","is_valid":1}}]
             */

            private TOOLSBANNERBean TOOLS_BANNER;

            public TOOLSBANNERBean getTOOLS_BANNER() {
                return TOOLS_BANNER;
            }

            public void setTOOLS_BANNER(TOOLSBANNERBean TOOLS_BANNER) {
                this.TOOLS_BANNER = TOOLS_BANNER;
            }

            public static class TOOLSBANNERBean {
                /**
                 * id : 14
                 * name : banner01
                 * site_type : 0
                 * posters : {"id":"1280","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Tpl/default/home/20160603qtxc.html?is_app=true","target_id":"0","image_path":"http://qnm.hunliji.com/FrQbtQH25Q3Z9K_p7WLFoBTssysx","title":"工具页banner","watch_count":"0","is_valid":1}
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
                     * id : 1280
                     * target_type : 9
                     * target_url : http://www.hunliji.com/p/wedding/Tpl/default/home/20160603qtxc.html?is_app=true
                     * target_id : 0
                     * image_path : http://qnm.hunliji.com/FrQbtQH25Q3Z9K_p7WLFoBTssysx
                     * title : 工具页banner
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
