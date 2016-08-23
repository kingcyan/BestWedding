package com.qf.util;

/**
 * Created by King
 * 2016/8/19
 */
public interface Contants {

    //BaseUrl
    String HTTP_ROOT = "http://www.hunliji.com/";

    //首页
    // 顶部图片
    String HTTP_HOME_ROOT = "http://2.mshouban.applinzi.com/";
    String HOME_HEAD_IMG = "bejson/fetchJSON.php?u=http%3A%2F%2Fwww.hunliji.com%2Fp%2Fwedding%2Findex.php%2Fhome%2FAPIPosterBlock%2Fblock_info%3Fid%3D1001%26app_version%3D6.8.7%26city%3D0%0A&_=1471513881375";

    //城市选择页
    String HOME_CITY_SELECT = "http://www.hunliji.com/p/wedding/index.php/home/APICity/cities?relative_id=264";

    //首页全部
    //问顾问
    String Ask_Consultant = "http://www.hunliji.com/p/wedding/index.php/home/Activities/ShowIndex/id/183&is_app=true?\n" +
            "city=190&user_id=3505598&appver=6.8.7";

    //嘉年华主会场
    String ASSEMBLY_ROOM = "http://www.hunliji.com/p/wedding/Tpl/default/home/20160825_main.html?is_app=true&city=190&user_id=3505598&appver=6.8.7";

    String HOME_ALL = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&last_time=1471684710&page=1&property_id=";
    //首页    婚礼策划
    String HOME_WEDDING_PLANNER = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=2";
    //首页    婚纱摄影
    String HOME_WEDDING_PHOTO = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=";
    //首页    婚纱礼服
    String HOME_WEDDING_DRESSES = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=12";
    //首页    婚礼摄影
    String HOME_WEDDING_PHOTOGRAPHY = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=7";
    //首页    婚礼摄像
    String HOME_WEDDING_CAMERA = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=8";
    //首页    婚礼跟妆
    String HOME_WEDDING_MAKEUP = "p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=9";
    //首页    婚礼司仪
    String HOME_WEDDING_EMCEE = "/p/wedding/index.php/home/APIFrontPageFeed/index?cid=0&per_page=20&page=1&property_id=11";




    //工具页面顶部的图片
    String TOOL_HEAD_IMG = "p/wedding/index.php/home/APIPosterBlock/block_info?id=1004&app_version=6.8.7&city=0";

    //新娘说RecyclerView数据源URL
    String BRIDE_URL = "p/wedding/Home/APICommunitySetup/RecommendThreads?page=1&per_page=15&city=0";
}
