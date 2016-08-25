package com.qf.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23 0023. on 20:56
 * xiaohl_902
 */
public class FinancialEntity2 {

    /**
     * RetCode : 0
     * msg : success
     */

    private StatusBean status;
    /**
     * status : {"RetCode":0,"msg":"success"}
     * data : [{"group":"1","financial_product":[{"id":"25","title":"平安普惠i贷","img":"http://qnm.hunliji.com/FkRvZqT0UpYYRG878d7OWkvolkKK","group":"1","target_type":"common","url":"http://www.10100000.com/m/iloan/apply2.html?utm_source=phmd-mdhunlijih&utm_medium=mkt&utm_campaign=mkt&WT.mc_id=CXX-MDHUNLIJIH-&","min_version":"","group_name":"信用类"},{"id":"18","title":"积木盒子","img":"http://qnm.hunliji.com/FkYRQ_xSOrvdbb5ii-dJGxEHzZuj","group":"1","target_type":"common","url":"https://loan-m.jimu.com/loanv2/apply/index?from=HLJ20160616002","min_version":null,"group_name":"信用类"},{"id":"20","title":"信用钱包","img":"http://qnm.hunliji.com/FnlgMjQB1zR6CxC4r9OGjoVkz5Fy","group":"1","target_type":"LiangHuaPai","url":"","min_version":null,"group_name":"信用类"}]},{"group":"2","financial_product":[{"id":"16","title":"51鑫时贷","img":"http://qnm.hunliji.com/FsOsa_kEmBgmelg3a3urb9Mq-MHz","group":"2","target_type":"51xsd","url":"http://h5.51gjj.com/mobile_web/e/hunliji/product.php?id=16","min_version":null,"group_name":"公积金类"},{"id":"17","title":"浦发财星IC金卡","img":"http://qnm.hunliji.com/Fo3Ovc_ufolKYiHopH4vR4dA1hL7","group":"2","target_type":"common","url":"http://h5.51gjj.com/mobile_web/e/hunliji/product.php?id=23","min_version":null,"group_name":"公积金类"},{"id":"19","title":"光大信用卡","img":"http://qnm.hunliji.com/FkNYQRBfRT_Ey6TAOJ_xttUaChx-","group":"2","target_type":"common","url":"http://h5.51gjj.com/mobile_web/e/hunliji/product.php?id=1","min_version":null,"group_name":"公积金类"}]}]
     * current_time : 1471957386
     */

    private int current_time;
    /**
     * group : 1
     * financial_product : [{"id":"25","title":"平安普惠i贷","img":"http://qnm.hunliji.com/FkRvZqT0UpYYRG878d7OWkvolkKK","group":"1","target_type":"common","url":"http://www.10100000.com/m/iloan/apply2.html?utm_source=phmd-mdhunlijih&utm_medium=mkt&utm_campaign=mkt&WT.mc_id=CXX-MDHUNLIJIH-&","min_version":"","group_name":"信用类"},{"id":"18","title":"积木盒子","img":"http://qnm.hunliji.com/FkYRQ_xSOrvdbb5ii-dJGxEHzZuj","group":"1","target_type":"common","url":"https://loan-m.jimu.com/loanv2/apply/index?from=HLJ20160616002","min_version":null,"group_name":"信用类"},{"id":"20","title":"信用钱包","img":"http://qnm.hunliji.com/FnlgMjQB1zR6CxC4r9OGjoVkz5Fy","group":"1","target_type":"LiangHuaPai","url":"","min_version":null,"group_name":"信用类"}]
     */

    private List<DataBean> data;

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public int getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(int current_time) {
        this.current_time = current_time;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
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
        private String group;
        /**
         * id : 25
         * title : 平安普惠i贷
         * img : http://qnm.hunliji.com/FkRvZqT0UpYYRG878d7OWkvolkKK
         * group : 1
         * target_type : common
         * url : http://www.10100000.com/m/iloan/apply2.html?utm_source=phmd-mdhunlijih&utm_medium=mkt&utm_campaign=mkt&WT.mc_id=CXX-MDHUNLIJIH-&
         * min_version :
         * group_name : 信用类
         */

        private List<FinancialProductBean> financial_product;

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public List<FinancialProductBean> getFinancial_product() {
            return financial_product;
        }

        public void setFinancial_product(List<FinancialProductBean> financial_product) {
            this.financial_product = financial_product;
        }

        public static class FinancialProductBean {
            private String id;
            private String title;
            private String img;
            private String group;
            private String target_type;
            private String url;
            private String min_version;
            private String group_name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getTarget_type() {
                return target_type;
            }

            public void setTarget_type(String target_type) {
                this.target_type = target_type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getGroup_name() {
                return group_name;
            }

            public void setGroup_name(String group_name) {
                this.group_name = group_name;
            }
        }
    }
}
