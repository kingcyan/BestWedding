package com.qf.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23 0023. on 20:55
 * xiaohl_902       两张图片实体类
 */
public class FinancialEntity1 {


    /**
     * RetCode : 0
     * msg : success
     */

    private StatusBean status;
    /**
     * id : 1006
     * name : 金融超市
     * floors : {"SITE_FINANCIAL_TOP_BANNER":{"id":"25","name":"金融超市顶部banner","style_name":"SITE_FINANCIAL_TOP_BANNER","style_image":null,"holes":[{"id":"62","name":"顶部banner01","site_type":"0","posters":{"id":"1583","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_credit.html","target_id":"0","image_path":"http://qnm.hunliji.com/Frt6rWSABi5WgiaNMAI-AEalpCJQ","title":"无抵押信用贷款","watch_count":"0","is_valid":1}},{"id":"63","name":"顶部banner02","site_type":"0"},{"id":"64","name":"顶部banner03","site_type":"0"}]},"SITE_FINANCIAL_MIDDLE_BANNER":{"id":"26","name":"金融超市中间banner","style_name":"SITE_FINANCIAL_MIDDLE_BANNER","style_image":null,"holes":[{"id":"65","name":"中间banner01","site_type":"0","posters":{"id":"1587","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_afund.html","target_id":null,"image_path":"http://qnm.hunliji.com/FtJRUdxcSJ4hMHAWo9zdNvQIj-QP","title":"公积金垫块","watch_count":"0","is_valid":1}},{"id":"66","name":"中间banner02","site_type":"0"},{"id":"67","name":"中间banner03","site_type":"0"}]},"SITE_FINANCIAL_BOTTOM_BANNER":{"id":"42","name":"金融超市底部banner","style_name":"SITE_FINANCIAL_BOTTOM_BANNER","style_image":null,"holes":[{"id":"112","name":"banner01","site_type":"0","posters":{"id":"2077","target_type":"47","target_url":"hljrn://www.hunliji.com/instalments_payment","target_id":"0","image_path":"http://qnm.hunliji.com/Fj6UEpcVIItP1OLHOsjY_H77ow6h","title":"金融超市底下的分期商城","watch_count":"0","is_valid":1}}]},"SITE_FINANCIAL_MARKET_BANNER":{"id":"8","name":"金融超市banner","style_name":"SITE_FINANCIAL_MARKET_BANNER","style_image":"http://qnm.hunliji.com/o_1al67d6be76n1h9g18r41s661i2gt.png","holes":[{"id":"21","name":"banner01","site_type":"0","posters":{"id":"1304","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/banking1.html","target_id":"0","image_path":"http://qnm.hunliji.com/Fmiyf6cG9_gzEnEELfXMMeVATVD6","title":"顶部banner","watch_count":"0","is_valid":1}}]}}
     */

    private DataBean data;
    /**
     * status : {"RetCode":0,"msg":"success"}
     * data : {"id":"1006","name":"金融超市","floors":{"SITE_FINANCIAL_TOP_BANNER":{"id":"25","name":"金融超市顶部banner","style_name":"SITE_FINANCIAL_TOP_BANNER","style_image":null,"holes":[{"id":"62","name":"顶部banner01","site_type":"0","posters":{"id":"1583","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_credit.html","target_id":"0","image_path":"http://qnm.hunliji.com/Frt6rWSABi5WgiaNMAI-AEalpCJQ","title":"无抵押信用贷款","watch_count":"0","is_valid":1}},{"id":"63","name":"顶部banner02","site_type":"0"},{"id":"64","name":"顶部banner03","site_type":"0"}]},"SITE_FINANCIAL_MIDDLE_BANNER":{"id":"26","name":"金融超市中间banner","style_name":"SITE_FINANCIAL_MIDDLE_BANNER","style_image":null,"holes":[{"id":"65","name":"中间banner01","site_type":"0","posters":{"id":"1587","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_afund.html","target_id":null,"image_path":"http://qnm.hunliji.com/FtJRUdxcSJ4hMHAWo9zdNvQIj-QP","title":"公积金垫块","watch_count":"0","is_valid":1}},{"id":"66","name":"中间banner02","site_type":"0"},{"id":"67","name":"中间banner03","site_type":"0"}]},"SITE_FINANCIAL_BOTTOM_BANNER":{"id":"42","name":"金融超市底部banner","style_name":"SITE_FINANCIAL_BOTTOM_BANNER","style_image":null,"holes":[{"id":"112","name":"banner01","site_type":"0","posters":{"id":"2077","target_type":"47","target_url":"hljrn://www.hunliji.com/instalments_payment","target_id":"0","image_path":"http://qnm.hunliji.com/Fj6UEpcVIItP1OLHOsjY_H77ow6h","title":"金融超市底下的分期商城","watch_count":"0","is_valid":1}}]},"SITE_FINANCIAL_MARKET_BANNER":{"id":"8","name":"金融超市banner","style_name":"SITE_FINANCIAL_MARKET_BANNER","style_image":"http://qnm.hunliji.com/o_1al67d6be76n1h9g18r41s661i2gt.png","holes":[{"id":"21","name":"banner01","site_type":"0","posters":{"id":"1304","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/banking1.html","target_id":"0","image_path":"http://qnm.hunliji.com/Fmiyf6cG9_gzEnEELfXMMeVATVD6","title":"顶部banner","watch_count":"0","is_valid":1}}]}}}
     * current_time : 1471957288
     */

    private int current_time;

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

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

    public static class StatusBean {
        private int RetCode;
        private String msg;

        public int getRetCode() {
            return RetCode;
        }

        public void setRetCode(int RetCode) {
            this.RetCode = RetCode;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class DataBean {
        private String id;
        private String name;
        /**
         * SITE_FINANCIAL_TOP_BANNER : {"id":"25","name":"金融超市顶部banner","style_name":"SITE_FINANCIAL_TOP_BANNER","style_image":null,"holes":[{"id":"62","name":"顶部banner01","site_type":"0","posters":{"id":"1583","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_credit.html","target_id":"0","image_path":"http://qnm.hunliji.com/Frt6rWSABi5WgiaNMAI-AEalpCJQ","title":"无抵押信用贷款","watch_count":"0","is_valid":1}},{"id":"63","name":"顶部banner02","site_type":"0"},{"id":"64","name":"顶部banner03","site_type":"0"}]}
         * SITE_FINANCIAL_MIDDLE_BANNER : {"id":"26","name":"金融超市中间banner","style_name":"SITE_FINANCIAL_MIDDLE_BANNER","style_image":null,"holes":[{"id":"65","name":"中间banner01","site_type":"0","posters":{"id":"1587","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_afund.html","target_id":null,"image_path":"http://qnm.hunliji.com/FtJRUdxcSJ4hMHAWo9zdNvQIj-QP","title":"公积金垫块","watch_count":"0","is_valid":1}},{"id":"66","name":"中间banner02","site_type":"0"},{"id":"67","name":"中间banner03","site_type":"0"}]}
         * SITE_FINANCIAL_BOTTOM_BANNER : {"id":"42","name":"金融超市底部banner","style_name":"SITE_FINANCIAL_BOTTOM_BANNER","style_image":null,"holes":[{"id":"112","name":"banner01","site_type":"0","posters":{"id":"2077","target_type":"47","target_url":"hljrn://www.hunliji.com/instalments_payment","target_id":"0","image_path":"http://qnm.hunliji.com/Fj6UEpcVIItP1OLHOsjY_H77ow6h","title":"金融超市底下的分期商城","watch_count":"0","is_valid":1}}]}
         * SITE_FINANCIAL_MARKET_BANNER : {"id":"8","name":"金融超市banner","style_name":"SITE_FINANCIAL_MARKET_BANNER","style_image":"http://qnm.hunliji.com/o_1al67d6be76n1h9g18r41s661i2gt.png","holes":[{"id":"21","name":"banner01","site_type":"0","posters":{"id":"1304","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/banking1.html","target_id":"0","image_path":"http://qnm.hunliji.com/Fmiyf6cG9_gzEnEELfXMMeVATVD6","title":"顶部banner","watch_count":"0","is_valid":1}}]}
         */

        private FloorsBean floors;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public FloorsBean getFloors() {
            return floors;
        }

        public void setFloors(FloorsBean floors) {
            this.floors = floors;
        }

        public static class FloorsBean {
            /**
             * id : 25
             * name : 金融超市顶部banner
             * style_name : SITE_FINANCIAL_TOP_BANNER
             * style_image : null
             * holes : [{"id":"62","name":"顶部banner01","site_type":"0","posters":{"id":"1583","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_credit.html","target_id":"0","image_path":"http://qnm.hunliji.com/Frt6rWSABi5WgiaNMAI-AEalpCJQ","title":"无抵押信用贷款","watch_count":"0","is_valid":1}},{"id":"63","name":"顶部banner02","site_type":"0"},{"id":"64","name":"顶部banner03","site_type":"0"}]
             */

            private SITEFINANCIALTOPBANNERBean SITE_FINANCIAL_TOP_BANNER;
            /**
             * id : 26
             * name : 金融超市中间banner
             * style_name : SITE_FINANCIAL_MIDDLE_BANNER
             * style_image : null
             * holes : [{"id":"65","name":"中间banner01","site_type":"0","posters":{"id":"1587","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_afund.html","target_id":null,"image_path":"http://qnm.hunliji.com/FtJRUdxcSJ4hMHAWo9zdNvQIj-QP","title":"公积金垫块","watch_count":"0","is_valid":1}},{"id":"66","name":"中间banner02","site_type":"0"},{"id":"67","name":"中间banner03","site_type":"0"}]
             */

            private SITEFINANCIALMIDDLEBANNERBean SITE_FINANCIAL_MIDDLE_BANNER;
            /**
             * id : 42
             * name : 金融超市底部banner
             * style_name : SITE_FINANCIAL_BOTTOM_BANNER
             * style_image : null
             * holes : [{"id":"112","name":"banner01","site_type":"0","posters":{"id":"2077","target_type":"47","target_url":"hljrn://www.hunliji.com/instalments_payment","target_id":"0","image_path":"http://qnm.hunliji.com/Fj6UEpcVIItP1OLHOsjY_H77ow6h","title":"金融超市底下的分期商城","watch_count":"0","is_valid":1}}]
             */

            private SITEFINANCIALBOTTOMBANNERBean SITE_FINANCIAL_BOTTOM_BANNER;
            /**
             * id : 8
             * name : 金融超市banner
             * style_name : SITE_FINANCIAL_MARKET_BANNER
             * style_image : http://qnm.hunliji.com/o_1al67d6be76n1h9g18r41s661i2gt.png
             * holes : [{"id":"21","name":"banner01","site_type":"0","posters":{"id":"1304","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/banking1.html","target_id":"0","image_path":"http://qnm.hunliji.com/Fmiyf6cG9_gzEnEELfXMMeVATVD6","title":"顶部banner","watch_count":"0","is_valid":1}}]
             */

            private SITEFINANCIALMARKETBANNERBean SITE_FINANCIAL_MARKET_BANNER;

            public SITEFINANCIALTOPBANNERBean getSITE_FINANCIAL_TOP_BANNER() {
                return SITE_FINANCIAL_TOP_BANNER;
            }

            public void setSITE_FINANCIAL_TOP_BANNER(SITEFINANCIALTOPBANNERBean SITE_FINANCIAL_TOP_BANNER) {
                this.SITE_FINANCIAL_TOP_BANNER = SITE_FINANCIAL_TOP_BANNER;
            }

            public SITEFINANCIALMIDDLEBANNERBean getSITE_FINANCIAL_MIDDLE_BANNER() {
                return SITE_FINANCIAL_MIDDLE_BANNER;
            }

            public void setSITE_FINANCIAL_MIDDLE_BANNER(SITEFINANCIALMIDDLEBANNERBean SITE_FINANCIAL_MIDDLE_BANNER) {
                this.SITE_FINANCIAL_MIDDLE_BANNER = SITE_FINANCIAL_MIDDLE_BANNER;
            }

            public SITEFINANCIALBOTTOMBANNERBean getSITE_FINANCIAL_BOTTOM_BANNER() {
                return SITE_FINANCIAL_BOTTOM_BANNER;
            }

            public void setSITE_FINANCIAL_BOTTOM_BANNER(SITEFINANCIALBOTTOMBANNERBean SITE_FINANCIAL_BOTTOM_BANNER) {
                this.SITE_FINANCIAL_BOTTOM_BANNER = SITE_FINANCIAL_BOTTOM_BANNER;
            }

            public SITEFINANCIALMARKETBANNERBean getSITE_FINANCIAL_MARKET_BANNER() {
                return SITE_FINANCIAL_MARKET_BANNER;
            }

            public void setSITE_FINANCIAL_MARKET_BANNER(SITEFINANCIALMARKETBANNERBean SITE_FINANCIAL_MARKET_BANNER) {
                this.SITE_FINANCIAL_MARKET_BANNER = SITE_FINANCIAL_MARKET_BANNER;
            }

            public static class SITEFINANCIALTOPBANNERBean {
                private String id;
                private String name;
                private String style_name;
                private Object style_image;
                /**
                 * id : 62
                 * name : 顶部banner01
                 * site_type : 0
                 * posters : {"id":"1583","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_credit.html","target_id":"0","image_path":"http://qnm.hunliji.com/Frt6rWSABi5WgiaNMAI-AEalpCJQ","title":"无抵押信用贷款","watch_count":"0","is_valid":1}
                 */

                private List<HolesBean> holes;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getStyle_name() {
                    return style_name;
                }

                public void setStyle_name(String style_name) {
                    this.style_name = style_name;
                }

                public Object getStyle_image() {
                    return style_image;
                }

                public void setStyle_image(Object style_image) {
                    this.style_image = style_image;
                }

                public List<HolesBean> getHoles() {
                    return holes;
                }

                public void setHoles(List<HolesBean> holes) {
                    this.holes = holes;
                }

                public static class HolesBean {
                    private String id;
                    private String name;
                    private String site_type;
                    /**
                     * id : 1583
                     * target_type : 9
                     * target_url : http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_credit.html
                     * target_id : 0
                     * image_path : http://qnm.hunliji.com/Frt6rWSABi5WgiaNMAI-AEalpCJQ
                     * title : 无抵押信用贷款
                     * watch_count : 0
                     * is_valid : 1
                     */

                    private PostersBean posters;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSite_type() {
                        return site_type;
                    }

                    public void setSite_type(String site_type) {
                        this.site_type = site_type;
                    }

                    public PostersBean getPosters() {
                        return posters;
                    }

                    public void setPosters(PostersBean posters) {
                        this.posters = posters;
                    }

                    public static class PostersBean {
                        private String id;
                        private String target_type;
                        private String target_url;
                        private String target_id;
                        private String image_path;
                        private String title;
                        private String watch_count;
                        private int is_valid;

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getTarget_type() {
                            return target_type;
                        }

                        public void setTarget_type(String target_type) {
                            this.target_type = target_type;
                        }

                        public String getTarget_url() {
                            return target_url;
                        }

                        public void setTarget_url(String target_url) {
                            this.target_url = target_url;
                        }

                        public String getTarget_id() {
                            return target_id;
                        }

                        public void setTarget_id(String target_id) {
                            this.target_id = target_id;
                        }

                        public String getImage_path() {
                            return image_path;
                        }

                        public void setImage_path(String image_path) {
                            this.image_path = image_path;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getWatch_count() {
                            return watch_count;
                        }

                        public void setWatch_count(String watch_count) {
                            this.watch_count = watch_count;
                        }

                        public int getIs_valid() {
                            return is_valid;
                        }

                        public void setIs_valid(int is_valid) {
                            this.is_valid = is_valid;
                        }
                    }
                }
            }

            public static class SITEFINANCIALMIDDLEBANNERBean {
                private String id;
                private String name;
                private String style_name;
                private Object style_image;
                /**
                 * id : 65
                 * name : 中间banner01
                 * site_type : 0
                 * posters : {"id":"1587","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_afund.html","target_id":null,"image_path":"http://qnm.hunliji.com/FtJRUdxcSJ4hMHAWo9zdNvQIj-QP","title":"公积金垫块","watch_count":"0","is_valid":1}
                 */

                private List<HolesBean> holes;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getStyle_name() {
                    return style_name;
                }

                public void setStyle_name(String style_name) {
                    this.style_name = style_name;
                }

                public Object getStyle_image() {
                    return style_image;
                }

                public void setStyle_image(Object style_image) {
                    this.style_image = style_image;
                }

                public List<HolesBean> getHoles() {
                    return holes;
                }

                public void setHoles(List<HolesBean> holes) {
                    this.holes = holes;
                }

                public static class HolesBean {
                    private String id;
                    private String name;
                    private String site_type;
                    /**
                     * id : 1587
                     * target_type : 9
                     * target_url : http://www.hunliji.com/p/wedding/Public/wap/activity/20160624_afund.html
                     * target_id : null
                     * image_path : http://qnm.hunliji.com/FtJRUdxcSJ4hMHAWo9zdNvQIj-QP
                     * title : 公积金垫块
                     * watch_count : 0
                     * is_valid : 1
                     */

                    private PostersBean posters;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSite_type() {
                        return site_type;
                    }

                    public void setSite_type(String site_type) {
                        this.site_type = site_type;
                    }

                    public PostersBean getPosters() {
                        return posters;
                    }

                    public void setPosters(PostersBean posters) {
                        this.posters = posters;
                    }

                    public static class PostersBean {
                        private String id;
                        private String target_type;
                        private String target_url;
                        private Object target_id;
                        private String image_path;
                        private String title;
                        private String watch_count;
                        private int is_valid;

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getTarget_type() {
                            return target_type;
                        }

                        public void setTarget_type(String target_type) {
                            this.target_type = target_type;
                        }

                        public String getTarget_url() {
                            return target_url;
                        }

                        public void setTarget_url(String target_url) {
                            this.target_url = target_url;
                        }

                        public Object getTarget_id() {
                            return target_id;
                        }

                        public void setTarget_id(Object target_id) {
                            this.target_id = target_id;
                        }

                        public String getImage_path() {
                            return image_path;
                        }

                        public void setImage_path(String image_path) {
                            this.image_path = image_path;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getWatch_count() {
                            return watch_count;
                        }

                        public void setWatch_count(String watch_count) {
                            this.watch_count = watch_count;
                        }

                        public int getIs_valid() {
                            return is_valid;
                        }

                        public void setIs_valid(int is_valid) {
                            this.is_valid = is_valid;
                        }
                    }
                }
            }

            public static class SITEFINANCIALBOTTOMBANNERBean {
                private String id;
                private String name;
                private String style_name;
                private Object style_image;
                /**
                 * id : 112
                 * name : banner01
                 * site_type : 0
                 * posters : {"id":"2077","target_type":"47","target_url":"hljrn://www.hunliji.com/instalments_payment","target_id":"0","image_path":"http://qnm.hunliji.com/Fj6UEpcVIItP1OLHOsjY_H77ow6h","title":"金融超市底下的分期商城","watch_count":"0","is_valid":1}
                 */

                private List<HolesBean> holes;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getStyle_name() {
                    return style_name;
                }

                public void setStyle_name(String style_name) {
                    this.style_name = style_name;
                }

                public Object getStyle_image() {
                    return style_image;
                }

                public void setStyle_image(Object style_image) {
                    this.style_image = style_image;
                }

                public List<HolesBean> getHoles() {
                    return holes;
                }

                public void setHoles(List<HolesBean> holes) {
                    this.holes = holes;
                }

                public static class HolesBean {
                    private String id;
                    private String name;
                    private String site_type;
                    /**
                     * id : 2077
                     * target_type : 47
                     * target_url : hljrn://www.hunliji.com/instalments_payment
                     * target_id : 0
                     * image_path : http://qnm.hunliji.com/Fj6UEpcVIItP1OLHOsjY_H77ow6h
                     * title : 金融超市底下的分期商城
                     * watch_count : 0
                     * is_valid : 1
                     */

                    private PostersBean posters;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSite_type() {
                        return site_type;
                    }

                    public void setSite_type(String site_type) {
                        this.site_type = site_type;
                    }

                    public PostersBean getPosters() {
                        return posters;
                    }

                    public void setPosters(PostersBean posters) {
                        this.posters = posters;
                    }

                    public static class PostersBean {
                        private String id;
                        private String target_type;
                        private String target_url;
                        private String target_id;
                        private String image_path;
                        private String title;
                        private String watch_count;
                        private int is_valid;

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getTarget_type() {
                            return target_type;
                        }

                        public void setTarget_type(String target_type) {
                            this.target_type = target_type;
                        }

                        public String getTarget_url() {
                            return target_url;
                        }

                        public void setTarget_url(String target_url) {
                            this.target_url = target_url;
                        }

                        public String getTarget_id() {
                            return target_id;
                        }

                        public void setTarget_id(String target_id) {
                            this.target_id = target_id;
                        }

                        public String getImage_path() {
                            return image_path;
                        }

                        public void setImage_path(String image_path) {
                            this.image_path = image_path;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getWatch_count() {
                            return watch_count;
                        }

                        public void setWatch_count(String watch_count) {
                            this.watch_count = watch_count;
                        }

                        public int getIs_valid() {
                            return is_valid;
                        }

                        public void setIs_valid(int is_valid) {
                            this.is_valid = is_valid;
                        }
                    }
                }
            }

            public static class SITEFINANCIALMARKETBANNERBean {
                private String id;
                private String name;
                private String style_name;
                private String style_image;
                /**
                 * id : 21
                 * name : banner01
                 * site_type : 0
                 * posters : {"id":"1304","target_type":"9","target_url":"http://www.hunliji.com/p/wedding/Public/wap/activity/banking1.html","target_id":"0","image_path":"http://qnm.hunliji.com/Fmiyf6cG9_gzEnEELfXMMeVATVD6","title":"顶部banner","watch_count":"0","is_valid":1}
                 */

                private List<HolesBean> holes;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getStyle_name() {
                    return style_name;
                }

                public void setStyle_name(String style_name) {
                    this.style_name = style_name;
                }

                public String getStyle_image() {
                    return style_image;
                }

                public void setStyle_image(String style_image) {
                    this.style_image = style_image;
                }

                public List<HolesBean> getHoles() {
                    return holes;
                }

                public void setHoles(List<HolesBean> holes) {
                    this.holes = holes;
                }

                public static class HolesBean {
                    private String id;
                    private String name;
                    private String site_type;
                    /**
                     * id : 1304
                     * target_type : 9
                     * target_url : http://www.hunliji.com/p/wedding/Public/wap/activity/banking1.html
                     * target_id : 0
                     * image_path : http://qnm.hunliji.com/Fmiyf6cG9_gzEnEELfXMMeVATVD6
                     * title : 顶部banner
                     * watch_count : 0
                     * is_valid : 1
                     */

                    private PostersBean posters;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSite_type() {
                        return site_type;
                    }

                    public void setSite_type(String site_type) {
                        this.site_type = site_type;
                    }

                    public PostersBean getPosters() {
                        return posters;
                    }

                    public void setPosters(PostersBean posters) {
                        this.posters = posters;
                    }

                    public static class PostersBean {
                        private String id;
                        private String target_type;
                        private String target_url;
                        private String target_id;
                        private String image_path;
                        private String title;
                        private String watch_count;
                        private int is_valid;

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getTarget_type() {
                            return target_type;
                        }

                        public void setTarget_type(String target_type) {
                            this.target_type = target_type;
                        }

                        public String getTarget_url() {
                            return target_url;
                        }

                        public void setTarget_url(String target_url) {
                            this.target_url = target_url;
                        }

                        public String getTarget_id() {
                            return target_id;
                        }

                        public void setTarget_id(String target_id) {
                            this.target_id = target_id;
                        }

                        public String getImage_path() {
                            return image_path;
                        }

                        public void setImage_path(String image_path) {
                            this.image_path = image_path;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getWatch_count() {
                            return watch_count;
                        }

                        public void setWatch_count(String watch_count) {
                            this.watch_count = watch_count;
                        }

                        public int getIs_valid() {
                            return is_valid;
                        }

                        public void setIs_valid(int is_valid) {
                            this.is_valid = is_valid;
                        }
                    }
                }
            }
        }
    }
}
