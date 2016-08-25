package com.qf.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23 0023. on 16:21
 * xiaohl_902
 */
public class CityEntity  {

    /**
     * RetCode : 0
     * msg : success
     */

    private StatusBean status;
    /**
     * list : {"a":[{"short_py":"alsm","pinyin":"alashanmeng","cid":"362","name":"阿拉善"},{"short_py":"as","pinyin":"anshan","cid":"30","name":"鞍山"},{"short_py":"anqing","pinyin":"anqing","cid":"94","name":"安庆"},{"short_py":"ay","pinyin":"anyang","cid":"143","name":"安阳"},{"short_py":"ad","pinyin":"anding","cid":"264","name":"定安"},{"short_py":"ab","pinyin":"aba","cid":"243","name":"阿坝"},{"short_py":"anshun","pinyin":"anshun","cid":"248","name":"安顺"},{"short_py":"al","pinyin":"ali","cid":"327","name":"阿里"},{"short_py":"ankang","pinyin":"ankang","cid":"303","name":"安康"},{"short_py":"aks","pinyin":"akesu","cid":"346","name":"阿克苏"},{"short_py":"al","pinyin":"ale","cid":"336","name":"阿勒泰"},{"short_py":"ale","pinyin":"alaer","cid":"347","name":"阿拉尔"},{"short_py":"am","pinyin":"aomen","cid":"370","name":"澳门"}],"b":[{"short_py":"bj","pinyin":"beijing","cid":"1","name":"北京"},{"short_py":"bd","pinyin":"baoding","cid":"7","name":"保定"},{"short_py":"bt","pinyin":"baotou","cid":"353","name":"包头"},{"short_py":"by","pinyin":"bayanzhuoer","cid":"359","name":"巴彦淖尔"},{"short_py":"benxi","pinyin":"benxi","cid":"32","name":"本溪"},{"short_py":"baishan","pinyin":"baishan","cid":"49","name":"白山"},{"short_py":"bc","pinyin":"baicheng","cid":"46","name":"白城"},{"short_py":"bengbu","pinyin":"bengbu","cid":"89","name":"蚌埠"},{"short_py":"bozhou","pinyin":"bozhou","cid":"101","name":"亳州"},{"short_py":"bz","pinyin":"binzhou","cid":"134","name":"滨州"},{"short_py":"bh","pinyin":"beihai","cid":"320","name":"北海"},{"short_py":"baise","pinyin":"baise","cid":"317","name":"百色"},{"short_py":"bs","pinyin":"baisha","cid":"267","name":"白沙"},{"short_py":"bt","pinyin":"baoting","cid":"271","name":"保亭"},{"short_py":"bazhong","pinyin":"bazhong","cid":"233","name":"巴中"},{"short_py":"bijie","pinyin":"bijie","cid":"252","name":"毕节"},{"short_py":"bs","pinyin":"baoshan","cid":"280","name":"保山"},{"short_py":"baoji","pinyin":"baoji","cid":"305","name":"宝鸡"},{"short_py":"by","pinyin":"baiyin","cid":"213","name":"白银"},{"short_py":"betl","pinyin":"boertala","cid":"338","name":"博尔塔拉"},{"short_py":"bygl","pinyin":"bayinguoleng","cid":"345","name":"巴音郭楞"}],"c":[{"short_py":"chengde","pinyin":"chengde","cid":"9","name":"承德"},{"short_py":"cangzhou","pinyin":"cangzhou","cid":"12","name":"沧州"},{"short_py":"changzhi","pinyin":"changzhi","cid":"22","name":"长治"},{"short_py":"chifeng","pinyin":"chifeng","cid":"357","name":"赤峰"},{"short_py":"cy","pinyin":"chaoyang","cid":"38","name":"朝阳"},{"short_py":"cc","pinyin":"changchun","cid":"41","name":"长春"},{"short_py":"cz","pinyin":"changzhou","cid":"73","name":"常州"},{"short_py":"chuzhou","pinyin":"chuzhou","cid":"96","name":"滁州"},{"short_py":"chizhou","pinyin":"chizhou","cid":"102","name":"池州"},{"short_py":"cs","pinyin":"changsha","cid":"177","name":"长沙"},{"short_py":"changde","pinyin":"changde","cid":"182","name":"常德"},{"short_py":"chenzhou","pinyin":"chenzhou","cid":"181","name":"郴州"},{"short_py":"chaozhou","pinyin":"chaozhou","cid":"209","name":"潮州"},{"short_py":"chongzuo","pinyin":"chongzuo","cid":"309","name":"崇左"},{"short_py":"cm","pinyin":"chengmai","cid":"263","name":"澄迈"},{"short_py":"cj","pinyin":"changjiang","cid":"268","name":"昌江"},{"short_py":"cq","pinyin":"chongqing","cid":"4","name":"重庆"},{"short_py":"cd","pinyin":"chengdu","cid":"225","name":"成都"},{"short_py":"cx","pinyin":"chuxiong","cid":"283","name":"楚雄"},{"short_py":"changdu","pinyin":"changdu","cid":"325","name":"昌都"},{"short_py":"changji","pinyin":"changji","cid":"342","name":"昌吉"}],"d":[{"short_py":"dt","pinyin":"datong","cid":"19","name":"大同"},{"short_py":"dl","pinyin":"dalian","cid":"29","name":"大连"},{"short_py":"dandong","pinyin":"dandong","cid":"33","name":"丹东"},{"short_py":"dq","pinyin":"daqing","cid":"62","name":"大庆"},{"short_py":"dxal","pinyin":"daxinganling","cid":"60","name":"大兴安岭"},{"short_py":"dy","pinyin":"dongying","cid":"135","name":"东营"},{"short_py":"dz","pinyin":"dezhou","cid":"128","name":"德州"},{"short_py":"dg","pinyin":"dongguan","cid":"210","name":"东莞"},{"short_py":null,"pinyin":"dongshaqundao","cid":"442101","name":"东沙"},{"short_py":"dz","pinyin":"danzhou","cid":"259","name":"儋州"},{"short_py":"df","pinyin":"dongfang","cid":"262","name":"东方"},{"short_py":"deyang","pinyin":"deyang","cid":"244","name":"德阳"},{"short_py":"dazhou","pinyin":"dazhou","cid":"230","name":"达州"},{"short_py":"dali","pinyin":"daili","cid":"277","name":"大理"},{"short_py":"dh","pinyin":"dehong","cid":"274","name":"德宏"},{"short_py":"diqing","pinyin":"diqing","cid":"287","name":"迪庆"},{"short_py":"dx","pinyin":"dingxi","cid":"221","name":"定西"}],"e":[{"short_py":"erds","pinyin":"eerduosi","cid":"358","name":"鄂尔多斯"},{"short_py":"ez","pinyin":"ezhou","cid":"161","name":"鄂州"},{"short_py":"es","pinyin":"enshi","cid":"168","name":"恩施"}],"f":[{"short_py":"fushun","pinyin":"fushun","cid":"31","name":"抚顺"},{"short_py":"fx","pinyin":"fuxin","cid":"36","name":"阜新"},{"short_py":"fy","pinyin":"fuyang","cid":"97","name":"阜阳"},{"short_py":"fz","pinyin":"fujianfuzhou","cid":"104","name":"福州"},{"short_py":"fuzhou","pinyin":"fuzhou","cid":"118","name":"抚州"},{"short_py":"fs","pinyin":"foshan","cid":"202","name":"佛山"},{"short_py":"fcg","pinyin":"fangchenggang","cid":"307","name":"防城港"}],"g":[{"short_py":"ganzhou","pinyin":"ganzhou","cid":"121","name":"赣州"},{"short_py":"gz","pinyin":"guangzhou","cid":"190","name":"广州"},{"short_py":"gl","pinyin":"guilin","cid":"312","name":"桂林"},{"short_py":"gg","pinyin":"guigang","cid":"315","name":"贵港"},{"short_py":"guangyuan","pinyin":"guangyuan","cid":"245","name":"广元"},{"short_py":"ga","pinyin":"guangan","cid":"232","name":"广安"},{"short_py":"ganzi","pinyin":"ganzi","cid":"242","name":"甘孜"},{"short_py":"gy","pinyin":"guiyang","cid":"246","name":"贵阳"},{"short_py":"gn","pinyin":"gannan","cid":"224","name":"甘南"},{"short_py":"guoluo","pinyin":"guoluo","cid":"294","name":"果洛"},{"short_py":"guyuan","pinyin":"guyuan","cid":"331","name":"固原"},{"short_py":"gx","pinyin":"gaoxiong","cid":"364","name":"高雄"}],"h":[{"short_py":"hd","pinyin":"handan","cid":"5","name":"邯郸"},{"short_py":"hs","pinyin":"hengshui","cid":"13","name":"衡水"},{"short_py":"hu","pinyin":"huhehaote","cid":"352","name":"呼和浩特"},{"short_py":"hlbe","pinyin":"hulunbeier","cid":"351","name":"呼伦贝尔"},{"short_py":"hld","pinyin":"huludao","cid":"40","name":"葫芦岛"},{"short_py":"hrb","pinyin":"haerbin","cid":"50","name":"哈尔滨"},{"short_py":"hegang","pinyin":"hegang","cid":"56","name":"鹤岗"},{"short_py":"heihe","pinyin":"heihe","cid":"59","name":"黑河"},{"short_py":"ha","pinyin":"huaian","cid":"71","name":"淮安"},{"short_py":"hz","pinyin":"hangzhou","cid":"78","name":"杭州"},{"short_py":"huzhou","pinyin":"huzhou","cid":"79","name":"湖州"},{"short_py":"hf","pinyin":"hefei","cid":"87","name":"合肥"},{"short_py":"hn","pinyin":"huainan","cid":"90","name":"淮南"},{"short_py":"huaibei","pinyin":"huaibei","cid":"92","name":"淮北"},{"short_py":"huangshan","pinyin":"huangshan","cid":"95","name":"黄山"},{"short_py":"heze","pinyin":"heze","cid":"124","name":"菏泽"},{"short_py":"hb","pinyin":"hebi","cid":"153","name":"鹤壁"},{"short_py":"hshi","pinyin":"huangshi","cid":"164","name":"黄石"},{"short_py":"hg","pinyin":"huanggang","cid":"163","name":"黄冈"},{"short_py":"hy","pinyin":"hengyang","cid":"180","name":"衡阳"},{"short_py":"hh","pinyin":"huaihua","cid":"188","name":"怀化"},{"short_py":"huizhou","pinyin":"huizhou","cid":"195","name":"惠州"},{"short_py":"heyuan","pinyin":"heyuan","cid":"206","name":"河源"},{"short_py":"hezhou","pinyin":"hezhou","cid":"314","name":"贺州"},{"short_py":"hc","pinyin":"hechi","cid":"319","name":"河池"},{"short_py":"haikou","pinyin":"haikou","cid":"255","name":"海口"},{"short_py":"honghe","pinyin":"honghe","cid":"278","name":"红河"},{"short_py":"hanzhong","pinyin":"hanzhong","cid":"304","name":"汉中"},{"short_py":"haidong","pinyin":"haidong","cid":"291","name":"海东"},{"short_py":"haibei","pinyin":"haibei","cid":"289","name":"海北"},{"short_py":"huangnan","pinyin":"huangnan","cid":"292","name":"黄南"},{"short_py":"hainan","pinyin":"hainan","cid":"293","name":"海南藏族"},{"short_py":"hx","pinyin":"haixi","cid":"296","name":"海西"},{"short_py":"hami","pinyin":"hami","cid":"334","name":"哈密"},{"short_py":"ht","pinyin":"hetian","cid":"335","name":"和田"},{"short_py":null,"pinyin":"hualianxian","cid":"712600","name":"花莲"},{"short_py":"hw","pinyin":"haiwai","cid":"405","name":"海外"}],"j":[{"short_py":"jincheng","pinyin":"jincheng","cid":"23","name":"晋城"},{"short_py":"jz","pinyin":"jinzhong","cid":"21","name":"晋中"},{"short_py":"jinzhou","pinyin":"jinzhou","cid":"34","name":"锦州"},{"short_py":"jl","pinyin":"jilin","cid":"42","name":"吉林"},{"short_py":"jixi","pinyin":"jixi","cid":"52","name":"鸡西"},{"short_py":"jms","pinyin":"jiamusi","cid":"55","name":"佳木斯"},{"short_py":"su","pinyin":"jiangsusuzhou","cid":"66","name":"苏州"},{"short_py":"jx","pinyin":"jiaxing","cid":"80","name":"嘉兴"},{"short_py":"jh","pinyin":"jinhua","cid":"85","name":"金华"},{"short_py":"jdz","pinyin":"jingdezhen","cid":"122","name":"景德镇"},{"short_py":"jj","pinyin":"jiujiang","cid":"116","name":"九江"},{"short_py":"ja","pinyin":"jian","cid":"120","name":"吉安"},{"short_py":"yichun","pinyin":"jiangxiyichun","cid":"119","name":"宜春"},{"short_py":"jn","pinyin":"jinan","cid":"125","name":"济南"},{"short_py":"jining","pinyin":"jining","cid":"131","name":"济宁"},{"short_py":"jiaozuo","pinyin":"jiaozuo","cid":"152","name":"焦作"},{"short_py":"jiyuan","pinyin":"jiyuan","cid":"151","name":"济源"},{"short_py":"jingmen","pinyin":"jingmen","cid":"172","name":"荆门"},{"short_py":"jingzhou","pinyin":"jingzhou","cid":"166","name":"荆州"},{"short_py":"jm","pinyin":"jiangmen","cid":"196","name":"江门"},{"short_py":"jy","pinyin":"jieyang","cid":"193","name":"揭阳"},{"short_py":"jyg","pinyin":"jiayuguan","cid":"215","name":"嘉峪关"},{"short_py":"jinchang","pinyin":"jinchang","cid":"212","name":"金昌"},{"short_py":"jq","pinyin":"jiuquan","cid":"219","name":"酒泉"},{"short_py":null,"pinyin":"jinmenxian","cid":"710500","name":"金门"},{"short_py":"jl","pinyin":"jilong","cid":"365","name":"基隆"},{"short_py":"jy","pinyin":"jiayi","cid":"369","name":"嘉义"},{"short_py":null,"pinyin":"jiayixian","cid":"711900","name":"嘉义"},{"short_py":null,"pinyin":"jiulong","cid":"810200","name":"九龙"}],"k":[{"short_py":"kaifeng","pinyin":"kaifeng","cid":"149","name":"开封"},{"short_py":"km","pinyin":"kunming","cid":"276","name":"昆明"},{"short_py":"klmy","pinyin":"kelamayi","cid":"339","name":"克拉玛依"},{"short_py":"kzls","pinyin":"kezilesu","cid":"337","name":"克孜勒苏柯尔克孜"},{"short_py":"ks","pinyin":"kashi","cid":"348","name":"喀什"}],"l":[{"short_py":"lf","pinyin":"langfang","cid":"11","name":"廊坊"},{"short_py":"linfen","pinyin":"linfen","cid":"24","name":"临汾"},{"short_py":"lvliang","pinyin":"lvliang","cid":"25","name":"吕梁"},{"short_py":"liaoyang","pinyin":"liaoyang","cid":"37","name":"辽阳"},{"short_py":"liaoyuan","pinyin":"liaoyuan","cid":"47","name":"辽源"},{"short_py":"lyg","pinyin":"lianyungang","cid":"72","name":"连云港"},{"short_py":"lishui","pinyin":"lishui","cid":"84","name":"丽水"},{"short_py":"la","pinyin":"liuan","cid":"100","name":"六安"},{"short_py":"ly","pinyin":"longyan","cid":"110","name":"龙岩"},{"short_py":"lw","pinyin":"laiwu","cid":"139","name":"莱芜"},{"short_py":"linyi","pinyin":"linyi","cid":"133","name":"临沂"},{"short_py":"lc","pinyin":"liaocheng","cid":"140","name":"聊城"},{"short_py":"luoyang","pinyin":"luoyang","cid":"150","name":"洛阳"},{"short_py":"luohe","pinyin":"luohe","cid":"156","name":"漯河"},{"short_py":"ld","pinyin":"loudi","cid":"184","name":"娄底"},{"short_py":"liuzhou","pinyin":"liuzhou","cid":"311","name":"柳州"},{"short_py":"lb","pinyin":"laibin","cid":"310","name":"来宾"},{"short_py":"lg","pinyin":"lingao","cid":"266","name":"临高"},{"short_py":"ld","pinyin":"ledong","cid":"269","name":"乐东"},{"short_py":"ls","pinyin":"lingshui","cid":"270","name":"陵水"},{"short_py":"luzhou","pinyin":"luzhou","cid":"234","name":"泸州"},{"short_py":"ls","pinyin":"leshan","cid":"238","name":"乐山"},{"short_py":"liangshan","pinyin":"liangshan","cid":"240","name":"凉山"},{"short_py":"lps","pinyin":"liupanshui","cid":"253","name":"六盘水"},{"short_py":"lj","pinyin":"lijiang","cid":"288","name":"丽江"},{"short_py":"lincang","pinyin":"lincang","cid":"285","name":"临沧"},{"short_py":"lasa","pinyin":"lasa","cid":"321","name":"拉萨"},{"short_py":"linzhi","pinyin":"linzhi","cid":"324","name":"林芝"},{"short_py":"lz","pinyin":"lanzhou","cid":"211","name":"兰州"},{"short_py":"ln","pinyin":"longnan","cid":"222","name":"陇南"},{"short_py":"linxia","pinyin":"linxia","cid":"223","name":"临夏"},{"short_py":null,"pinyin":"lianjiangxian","cid":"712800","name":"连江"}],"m":[{"short_py":"mdj","pinyin":"mudanjiang","cid":"53","name":"牡丹江"},{"short_py":"mas","pinyin":"maanshan","cid":"91","name":"马鞍山"},{"short_py":"mm","pinyin":"maoming","cid":"194","name":"茂名"},{"short_py":"mz","pinyin":"meizhou","cid":"198","name":"梅州"},{"short_py":"mianyang","pinyin":"mianyang","cid":"228","name":"绵阳"},{"short_py":"ms","pinyin":"meishan","cid":"239","name":"眉山"},{"short_py":null,"pinyin":"miaolixian","cid":"711500","name":"苗栗"}],"n":[{"short_py":"nj","pinyin":"nanjing","cid":"63","name":"南京"},{"short_py":"nt","pinyin":"nantong","cid":"67","name":"南通"},{"short_py":"nb","pinyin":"ningbo","cid":"81","name":"宁波"},{"short_py":"np","pinyin":"nanping","cid":"112","name":"南平"},{"short_py":"nd","pinyin":"ningde","cid":"106","name":"宁德"},{"short_py":"nc","pinyin":"nanchang","cid":"115","name":"南昌"},{"short_py":"ny","pinyin":"nanyang","cid":"148","name":"南阳"},{"short_py":"nn","pinyin":"nanning","cid":"308","name":"南宁"},{"short_py":"scnj","pinyin":"neijiang","cid":"237","name":"内江"},{"short_py":"nanchong","pinyin":"nanchong","cid":"229","name":"南充"},{"short_py":"nujiang","pinyin":"nujiang","cid":"286","name":"怒江"},{"short_py":"nq","pinyin":"naqu","cid":"326","name":"那曲"},{"short_py":null,"pinyin":"nantouxian","cid":"710600","name":"南投"}],"p":[{"short_py":"pj","pinyin":"panjin","cid":"39","name":"盘锦"},{"short_py":"pt","pinyin":"putian","cid":"107","name":"莆田"},{"short_py":"px","pinyin":"pingxiang","cid":"123","name":"萍乡"},{"short_py":"pds","pinyin":"pingdingshan","cid":"146","name":"平顶山"},{"short_py":"puyang","pinyin":"puyang","cid":"154","name":"濮阳"},{"short_py":"panzhihua","pinyin":"panzhihua","cid":"226","name":"攀枝花"},{"short_py":"pe","pinyin":"puer","cid":"284","name":"普洱"},{"short_py":"pl","pinyin":"pingliang","cid":"218","name":"平凉"},{"short_py":null,"pinyin":"pingdongxian","cid":"712400","name":"屏东"},{"short_py":null,"pinyin":"penghuxian","cid":"712700","name":"澎湖"}],"q":[{"short_py":"qhd","pinyin":"qinhuangdao","cid":"15","name":"秦皇岛"},{"short_py":"qqhr","pinyin":"qiqihaer","cid":"51","name":"齐齐哈尔"},{"short_py":"qth","pinyin":"qitaihe","cid":"54","name":"七台河"},{"short_py":"quzhou","pinyin":"quzhou","cid":"77","name":"衢州"},{"short_py":"qz","pinyin":"quanzhou","cid":"108","name":"泉州"},{"short_py":"qd","pinyin":"qingdao","cid":"126","name":"青岛"},{"short_py":"qianjiang","pinyin":"qianjiang","cid":"175","name":"潜江"},{"short_py":"qingyuan","pinyin":"qingyuan","cid":"207","name":"清远"},{"short_py":"qinzhou","pinyin":"qinzhou","cid":"318","name":"钦州"},{"short_py":"qh","pinyin":"qionghai","cid":"258","name":"琼海"},{"short_py":"qz","pinyin":"qiongzhong","cid":"272","name":"琼中"},{"short_py":"qxn","pinyin":"qianxinan","cid":"254","name":"黔西南"},{"short_py":"qdn","pinyin":"qiandongnan","cid":"250","name":"黔东南"},{"short_py":"qn","pinyin":"qiannan","cid":"249","name":"黔南"},{"short_py":"qj","pinyin":"qujing","cid":"279","name":"曲靖"},{"short_py":"qingyang","pinyin":"qingyang","cid":"220","name":"庆阳"}],"r":[{"short_py":"rizhao","pinyin":"rizhao","cid":"138","name":"日照"},{"short_py":"rkz","pinyin":"rikaze","cid":"322","name":"日喀则"}],"s":[{"short_py":"sjz","pinyin":"shijiazhuang","cid":"6","name":"石家庄"},{"short_py":"shuozhou","pinyin":"shuozhou","cid":"16","name":"朔州"},{"short_py":"sy","pinyin":"shenyang","cid":"27","name":"沈阳"},{"short_py":"sp","pinyin":"siping","cid":"44","name":"四平"},{"short_py":"songyuan","pinyin":"songyuan","cid":"48","name":"松原"},{"short_py":"sys","pinyin":"shuangyashan","cid":"57","name":"双鸭山"},{"short_py":"suihua","pinyin":"suihua","cid":"58","name":"绥化"},{"short_py":"sh","pinyin":"shanghai","cid":"3","name":"上海"},{"short_py":"suqian","pinyin":"suqian","cid":"75","name":"宿迁"},{"short_py":"sx","pinyin":"shaoxing","cid":"82","name":"绍兴"},{"short_py":"suzhou","pinyin":"suzhou","cid":"98","name":"宿州"},{"short_py":"sm","pinyin":"sanming","cid":"111","name":"三明"},{"short_py":"sr","pinyin":"shangrao","cid":"117","name":"上饶"},{"short_py":"smx","pinyin":"sanmenxia","cid":"158","name":"三门峡"},{"short_py":"sq","pinyin":"shangqiu","cid":"141","name":"商丘"},{"short_py":"shiyan","pinyin":"shiyan","cid":"170","name":"十堰"},{"short_py":"suizhou","pinyin":"suizhou","cid":"171","name":"随州"},{"short_py":"snj","pinyin":"shennongjia","cid":"169","name":"神农架"},{"short_py":"shaoyang","pinyin":"shaoyang","cid":"185","name":"邵阳"},{"short_py":"sg","pinyin":"shaoguan","cid":"197","name":"韶关"},{"short_py":"sz","pinyin":"shenzhen","cid":"200","name":"深圳"},{"short_py":"st","pinyin":"shantou","cid":"199","name":"汕头"},{"short_py":"sw","pinyin":"shanwei","cid":"191","name":"汕尾"},{"short_py":"sanya","pinyin":"sanya","cid":"256","name":"三亚"},{"short_py":null,"pinyin":"sanshashi","cid":"460300","name":"三沙"},{"short_py":"suining","pinyin":"suining","cid":"231","name":"遂宁"},{"short_py":"sn","pinyin":"shannan","cid":"323","name":"山南"},{"short_py":"yl","pinyin":"shanxiyulin","cid":"300","name":"榆林"},{"short_py":"sl","pinyin":"shangluo","cid":"302","name":"商洛"},{"short_py":"szs","pinyin":"shizuishan","cid":"329","name":"石嘴山"},{"short_py":"shz","pinyin":"shihezi","cid":"341","name":"石河子"}],"t":[{"short_py":"tj","pinyin":"tianjin","cid":"2","name":"天津"},{"short_py":"ts","pinyin":"tangshan","cid":"10","name":"唐山"},{"short_py":"ty","pinyin":"taiyuan","cid":"18","name":"太原"},{"short_py":"tongliao","pinyin":"tongliao","cid":"356","name":"通辽"},{"short_py":"tl","pinyin":"tieling","cid":"28","name":"铁岭"},{"short_py":"th","pinyin":"tonghua","cid":"45","name":"通化"},{"short_py":"taizhou","pinyin":"taizhou","cid":"74","name":"泰州"},{"short_py":"tongling","pinyin":"tongling","cid":"93","name":"铜陵"},{"short_py":"ta","pinyin":"taian","cid":"132","name":"泰安"},{"short_py":"tm","pinyin":"tianmen","cid":"174","name":"天门"},{"short_py":"tc","pinyin":"tunchang","cid":"265","name":"屯昌"},{"short_py":"tr","pinyin":"tongren","cid":"251","name":"铜仁"},{"short_py":"tc","pinyin":"tongchuan","cid":"306","name":"铜川"},{"short_py":"tianshui","pinyin":"tianshui","cid":"214","name":"天水"},{"short_py":"tlf","pinyin":"tulufan","cid":"344","name":"吐鲁番"},{"short_py":"tc","pinyin":"tangcheng","cid":"333","name":"塔城"},{"short_py":"tmsk","pinyin":"tumushuke","cid":"349","name":"图木舒克"},{"short_py":"tb","pinyin":"taibei","cid":"363","name":"台北"},{"short_py":"tn","pinyin":"tainan","cid":"367","name":"台南"},{"short_py":"tz","pinyin":"taizhong","cid":"366","name":"台中"},{"short_py":null,"pinyin":"taoyuanxian","cid":"711400","name":"桃园"},{"short_py":null,"pinyin":"taidongxian","cid":"712500","name":"台东"}],"w":[{"short_py":"wuhai","pinyin":"wuhai","cid":"354","name":"乌海"},{"short_py":"wlcb","pinyin":"wulanchabu","cid":"355","name":"乌兰察布"},{"short_py":"wx","pinyin":"wuxi","cid":"64","name":"无锡"},{"short_py":"wz","pinyin":"wenzhou","cid":"83","name":"温州"},{"short_py":"wuhu","pinyin":"wuhu","cid":"88","name":"芜湖"},{"short_py":"wf","pinyin":"weifang","cid":"130","name":"潍坊"},{"short_py":"weihai","pinyin":"weihai","cid":"136","name":"威海"},{"short_py":"wh","pinyin":"wuhan","cid":"159","name":"武汉"},{"short_py":"wuzhou","pinyin":"wuzhou","cid":"313","name":"梧州"},{"short_py":"wzs","pinyin":"wuzhishan","cid":"257","name":"五指山"},{"short_py":"wc","pinyin":"wenchang","cid":"260","name":"文昌"},{"short_py":"wn","pinyin":"wanning","cid":"261","name":"万宁"},{"short_py":"ws","pinyin":"wenshan","cid":"281","name":"文山"},{"short_py":"wn","pinyin":"weinan","cid":"301","name":"渭南"},{"short_py":"wuwei","pinyin":"wuwei","cid":"216","name":"武威"},{"short_py":"wuzhong","pinyin":"wuzhong","cid":"330","name":"吴忠"},{"short_py":"wlmq","pinyin":"wulumuqi","cid":"340","name":"乌鲁木齐"},{"short_py":"wjq","pinyin":"wujiaqu","cid":"343","name":"五家渠"}],"x":[{"short_py":"xt","pinyin":"xingtai","cid":"14","name":"邢台"},{"short_py":"xinzhou","pinyin":"xinzhou","cid":"17","name":"忻州"},{"short_py":"xam","pinyin":"xinganmeng","cid":"361","name":"兴安"},{"short_py":"xl","pinyin":"xilinguolemeng","cid":"360","name":"锡林郭勒"},{"short_py":"xz","pinyin":"xuzhou","cid":"70","name":"徐州"},{"short_py":"xuancheng","pinyin":"xuancheng","cid":"103","name":"宣城"},{"short_py":"xm","pinyin":"xiamen","cid":"105","name":"厦门"},{"short_py":"xinyu","pinyin":"xinyu","cid":"114","name":"新余"},{"short_py":"xx","pinyin":"xinxiang","cid":"144","name":"新乡"},{"short_py":"xc","pinyin":"xuchang","cid":"145","name":"许昌"},{"short_py":"xy","pinyin":"xinyang","cid":"147","name":"信阳"},{"short_py":"xf","pinyin":"xiangyang","cid":"392","name":"襄阳"},{"short_py":"xiaogan","pinyin":"xiaogan","cid":"162","name":"孝感"},{"short_py":"xianning","pinyin":"xianning","cid":"165","name":"咸宁"},{"short_py":"xiantao","pinyin":"xiantao","cid":"173","name":"仙桃"},{"short_py":"xiangtan","pinyin":"xiangtan","cid":"178","name":"湘潭"},{"short_py":"xiangxi","pinyin":"xiangxi","cid":"186","name":"湘西"},{"short_py":"bn","pinyin":"xishuangbanna","cid":"273","name":"西双版纳"},{"short_py":"xa","pinyin":"xian","cid":"297","name":"西安"},{"short_py":"xianyang","pinyin":"xianyang","cid":"298","name":"咸阳"},{"short_py":"xn","pinyin":"xining","cid":"290","name":"西宁"},{"short_py":"xz","pinyin":"xinzhu","cid":"368","name":"新竹"},{"short_py":null,"pinyin":"xinbeishi","cid":"711100","name":"新北"},{"short_py":null,"pinyin":"xinzhuxian","cid":"711300","name":"新竹"},{"short_py":null,"pinyin":"xianggangdao","cid":"371","name":"香港岛"},{"short_py":null,"pinyin":"xinjie","cid":"810300","name":"新界"}],"y":[{"short_py":"yq","pinyin":"yangquan","cid":"20","name":"阳泉"},{"short_py":"yuncheng","pinyin":"yuncheng","cid":"26","name":"运城"},{"short_py":"yk","pinyin":"yingkou","cid":"35","name":"营口"},{"short_py":"yanbian","pinyin":"yanbian","cid":"43","name":"延边朝鲜族"},{"short_py":"yich","pinyin":"yichun","cid":"61","name":"伊春"},{"short_py":"yancheng","pinyin":"yancheng","cid":"69","name":"盐城"},{"short_py":"yz","pinyin":"yangzhou","cid":"68","name":"扬州"},{"short_py":"yingtan","pinyin":"yingtan","cid":"113","name":"鹰潭"},{"short_py":"yt","pinyin":"yantai","cid":"129","name":"烟台"},{"short_py":"yc","pinyin":"yichang","cid":"167","name":"宜昌"},{"short_py":"yy","pinyin":"yueyang","cid":"176","name":"岳阳"},{"short_py":"yiyang","pinyin":"yiyang","cid":"183","name":"益阳"},{"short_py":"yongzhou","pinyin":"yongzhou","cid":"189","name":"永州"},{"short_py":"yj","pinyin":"yangjiang","cid":"192","name":"阳江"},{"short_py":"yf","pinyin":"yunfu","cid":"208","name":"云浮"},{"short_py":"yulin","pinyin":"yulin","cid":"316","name":"玉林"},{"short_py":"yb","pinyin":"yibin","cid":"235","name":"宜宾"},{"short_py":"ya","pinyin":"yaan","cid":"241","name":"雅安"},{"short_py":"yx","pinyin":"yuxi","cid":"282","name":"玉溪"},{"short_py":"yanan","pinyin":"yanan","cid":"299","name":"延安"},{"short_py":"ys","pinyin":"yushu","cid":"295","name":"玉树"},{"short_py":"yinchuan","pinyin":"yinchuan","cid":"328","name":"银川"},{"short_py":"yili","pinyin":"yili","cid":"350","name":"伊犁"},{"short_py":null,"pinyin":"yilanxian","cid":"711200","name":"宜兰"},{"short_py":null,"pinyin":"yunlinxian","cid":"712100","name":"云林"}],"z":[{"short_py":"zjk","pinyin":"zhangjiakou","cid":"8","name":"张家口"},{"short_py":"zj","pinyin":"zhenjiang","cid":"65","name":"镇江"},{"short_py":"zhoushan","pinyin":"zhoushan","cid":"76","name":"舟山"},{"short_py":"tz","pinyin":"zhejiangtaizhou","cid":"86","name":"台州"},{"short_py":"zhangzhou","pinyin":"zhangzhou","cid":"109","name":"漳州"},{"short_py":"zb","pinyin":"zibo","cid":"127","name":"淄博"},{"short_py":"zaozhuang","pinyin":"zaozhuang","cid":"137","name":"枣庄"},{"short_py":"zz","pinyin":"zhengzhou","cid":"142","name":"郑州"},{"short_py":"zk","pinyin":"zhoukou","cid":"155","name":"周口"},{"short_py":"zmd","pinyin":"zhumadian","cid":"157","name":"驻马店"},{"short_py":"zhuzhou","pinyin":"zhuzhou","cid":"179","name":"株洲"},{"short_py":"zjj","pinyin":"zhangjiajie","cid":"187","name":"张家界"},{"short_py":"zh","pinyin":"zhuhai","cid":"201","name":"珠海"},{"short_py":"zhanjiang","pinyin":"zhanjiang","cid":"204","name":"湛江"},{"short_py":"zq","pinyin":"zhaoqing","cid":"203","name":"肇庆"},{"short_py":"zs","pinyin":"zhongshan","cid":"205","name":"中山"},{"short_py":"zg","pinyin":"zigong","cid":"227","name":"自贡"},{"short_py":"zy","pinyin":"ziyang","cid":"236","name":"资阳"},{"short_py":"zunyi","pinyin":"zunyi","cid":"247","name":"遵义"},{"short_py":"zt","pinyin":"zhaotong","cid":"275","name":"昭通"},{"short_py":"zhangye","pinyin":"zhangye","cid":"217","name":"张掖"},{"short_py":"zw","pinyin":"zhongwei","cid":"332","name":"中卫"},{"short_py":null,"pinyin":"zhanghuaxian","cid":"711700","name":"彰化"}]}
     * hot_city : [{"cid":78,"name":"杭州","pinyin":"hangzhou"},{"cid":1,"name":"北京","pinyin":"beijing"},{"cid":3,"name":"上海","pinyin":"shanghai"},{"cid":200,"name":"深圳","pinyin":"shenzhen"},{"cid":297,"name":"西安","pinyin":"xian"},{"cid":225,"name":"成都","pinyin":"chengdu"},{"cid":190,"name":"广州","pinyin":"guangzhou"},{"cid":159,"name":"武汉","pinyin":"wuhan"},{"cid":63,"name":"南京","pinyin":"nanjing"},{"cid":4,"name":"重庆","pinyin":"chongqing"},{"cid":66,"name":"苏州","pinyin":"jiangsusuzhou"},{"cid":2,"name":"天津","pinyin":"tianjin"},{"cid":105,"name":"厦门","pinyin":"xiamen"},{"cid":256,"name":"三亚","pinyin":"sanya"},{"cid":177,"name":"长沙","pinyin":"changsha"},{"cid":142,"name":"郑州","pinyin":"zhengzhou"}]
     * relative_city : [{"name":null,"cid":"256"}]
     */

    private DataBean data;
    /**
     * status : {"RetCode":0,"msg":"success"}
     * data : {"list":{"a":[{"short_py":"alsm","pinyin":"alashanmeng","cid":"362","name":"阿拉善"},{"short_py":"as","pinyin":"anshan","cid":"30","name":"鞍山"},{"short_py":"anqing","pinyin":"anqing","cid":"94","name":"安庆"},{"short_py":"ay","pinyin":"anyang","cid":"143","name":"安阳"},{"short_py":"ad","pinyin":"anding","cid":"264","name":"定安"},{"short_py":"ab","pinyin":"aba","cid":"243","name":"阿坝"},{"short_py":"anshun","pinyin":"anshun","cid":"248","name":"安顺"},{"short_py":"al","pinyin":"ali","cid":"327","name":"阿里"},{"short_py":"ankang","pinyin":"ankang","cid":"303","name":"安康"},{"short_py":"aks","pinyin":"akesu","cid":"346","name":"阿克苏"},{"short_py":"al","pinyin":"ale","cid":"336","name":"阿勒泰"},{"short_py":"ale","pinyin":"alaer","cid":"347","name":"阿拉尔"},{"short_py":"am","pinyin":"aomen","cid":"370","name":"澳门"}],"b":[{"short_py":"bj","pinyin":"beijing","cid":"1","name":"北京"},{"short_py":"bd","pinyin":"baoding","cid":"7","name":"保定"},{"short_py":"bt","pinyin":"baotou","cid":"353","name":"包头"},{"short_py":"by","pinyin":"bayanzhuoer","cid":"359","name":"巴彦淖尔"},{"short_py":"benxi","pinyin":"benxi","cid":"32","name":"本溪"},{"short_py":"baishan","pinyin":"baishan","cid":"49","name":"白山"},{"short_py":"bc","pinyin":"baicheng","cid":"46","name":"白城"},{"short_py":"bengbu","pinyin":"bengbu","cid":"89","name":"蚌埠"},{"short_py":"bozhou","pinyin":"bozhou","cid":"101","name":"亳州"},{"short_py":"bz","pinyin":"binzhou","cid":"134","name":"滨州"},{"short_py":"bh","pinyin":"beihai","cid":"320","name":"北海"},{"short_py":"baise","pinyin":"baise","cid":"317","name":"百色"},{"short_py":"bs","pinyin":"baisha","cid":"267","name":"白沙"},{"short_py":"bt","pinyin":"baoting","cid":"271","name":"保亭"},{"short_py":"bazhong","pinyin":"bazhong","cid":"233","name":"巴中"},{"short_py":"bijie","pinyin":"bijie","cid":"252","name":"毕节"},{"short_py":"bs","pinyin":"baoshan","cid":"280","name":"保山"},{"short_py":"baoji","pinyin":"baoji","cid":"305","name":"宝鸡"},{"short_py":"by","pinyin":"baiyin","cid":"213","name":"白银"},{"short_py":"betl","pinyin":"boertala","cid":"338","name":"博尔塔拉"},{"short_py":"bygl","pinyin":"bayinguoleng","cid":"345","name":"巴音郭楞"}],"c":[{"short_py":"chengde","pinyin":"chengde","cid":"9","name":"承德"},{"short_py":"cangzhou","pinyin":"cangzhou","cid":"12","name":"沧州"},{"short_py":"changzhi","pinyin":"changzhi","cid":"22","name":"长治"},{"short_py":"chifeng","pinyin":"chifeng","cid":"357","name":"赤峰"},{"short_py":"cy","pinyin":"chaoyang","cid":"38","name":"朝阳"},{"short_py":"cc","pinyin":"changchun","cid":"41","name":"长春"},{"short_py":"cz","pinyin":"changzhou","cid":"73","name":"常州"},{"short_py":"chuzhou","pinyin":"chuzhou","cid":"96","name":"滁州"},{"short_py":"chizhou","pinyin":"chizhou","cid":"102","name":"池州"},{"short_py":"cs","pinyin":"changsha","cid":"177","name":"长沙"},{"short_py":"changde","pinyin":"changde","cid":"182","name":"常德"},{"short_py":"chenzhou","pinyin":"chenzhou","cid":"181","name":"郴州"},{"short_py":"chaozhou","pinyin":"chaozhou","cid":"209","name":"潮州"},{"short_py":"chongzuo","pinyin":"chongzuo","cid":"309","name":"崇左"},{"short_py":"cm","pinyin":"chengmai","cid":"263","name":"澄迈"},{"short_py":"cj","pinyin":"changjiang","cid":"268","name":"昌江"},{"short_py":"cq","pinyin":"chongqing","cid":"4","name":"重庆"},{"short_py":"cd","pinyin":"chengdu","cid":"225","name":"成都"},{"short_py":"cx","pinyin":"chuxiong","cid":"283","name":"楚雄"},{"short_py":"changdu","pinyin":"changdu","cid":"325","name":"昌都"},{"short_py":"changji","pinyin":"changji","cid":"342","name":"昌吉"}],"d":[{"short_py":"dt","pinyin":"datong","cid":"19","name":"大同"},{"short_py":"dl","pinyin":"dalian","cid":"29","name":"大连"},{"short_py":"dandong","pinyin":"dandong","cid":"33","name":"丹东"},{"short_py":"dq","pinyin":"daqing","cid":"62","name":"大庆"},{"short_py":"dxal","pinyin":"daxinganling","cid":"60","name":"大兴安岭"},{"short_py":"dy","pinyin":"dongying","cid":"135","name":"东营"},{"short_py":"dz","pinyin":"dezhou","cid":"128","name":"德州"},{"short_py":"dg","pinyin":"dongguan","cid":"210","name":"东莞"},{"short_py":null,"pinyin":"dongshaqundao","cid":"442101","name":"东沙"},{"short_py":"dz","pinyin":"danzhou","cid":"259","name":"儋州"},{"short_py":"df","pinyin":"dongfang","cid":"262","name":"东方"},{"short_py":"deyang","pinyin":"deyang","cid":"244","name":"德阳"},{"short_py":"dazhou","pinyin":"dazhou","cid":"230","name":"达州"},{"short_py":"dali","pinyin":"daili","cid":"277","name":"大理"},{"short_py":"dh","pinyin":"dehong","cid":"274","name":"德宏"},{"short_py":"diqing","pinyin":"diqing","cid":"287","name":"迪庆"},{"short_py":"dx","pinyin":"dingxi","cid":"221","name":"定西"}],"e":[{"short_py":"erds","pinyin":"eerduosi","cid":"358","name":"鄂尔多斯"},{"short_py":"ez","pinyin":"ezhou","cid":"161","name":"鄂州"},{"short_py":"es","pinyin":"enshi","cid":"168","name":"恩施"}],"f":[{"short_py":"fushun","pinyin":"fushun","cid":"31","name":"抚顺"},{"short_py":"fx","pinyin":"fuxin","cid":"36","name":"阜新"},{"short_py":"fy","pinyin":"fuyang","cid":"97","name":"阜阳"},{"short_py":"fz","pinyin":"fujianfuzhou","cid":"104","name":"福州"},{"short_py":"fuzhou","pinyin":"fuzhou","cid":"118","name":"抚州"},{"short_py":"fs","pinyin":"foshan","cid":"202","name":"佛山"},{"short_py":"fcg","pinyin":"fangchenggang","cid":"307","name":"防城港"}],"g":[{"short_py":"ganzhou","pinyin":"ganzhou","cid":"121","name":"赣州"},{"short_py":"gz","pinyin":"guangzhou","cid":"190","name":"广州"},{"short_py":"gl","pinyin":"guilin","cid":"312","name":"桂林"},{"short_py":"gg","pinyin":"guigang","cid":"315","name":"贵港"},{"short_py":"guangyuan","pinyin":"guangyuan","cid":"245","name":"广元"},{"short_py":"ga","pinyin":"guangan","cid":"232","name":"广安"},{"short_py":"ganzi","pinyin":"ganzi","cid":"242","name":"甘孜"},{"short_py":"gy","pinyin":"guiyang","cid":"246","name":"贵阳"},{"short_py":"gn","pinyin":"gannan","cid":"224","name":"甘南"},{"short_py":"guoluo","pinyin":"guoluo","cid":"294","name":"果洛"},{"short_py":"guyuan","pinyin":"guyuan","cid":"331","name":"固原"},{"short_py":"gx","pinyin":"gaoxiong","cid":"364","name":"高雄"}],"h":[{"short_py":"hd","pinyin":"handan","cid":"5","name":"邯郸"},{"short_py":"hs","pinyin":"hengshui","cid":"13","name":"衡水"},{"short_py":"hu","pinyin":"huhehaote","cid":"352","name":"呼和浩特"},{"short_py":"hlbe","pinyin":"hulunbeier","cid":"351","name":"呼伦贝尔"},{"short_py":"hld","pinyin":"huludao","cid":"40","name":"葫芦岛"},{"short_py":"hrb","pinyin":"haerbin","cid":"50","name":"哈尔滨"},{"short_py":"hegang","pinyin":"hegang","cid":"56","name":"鹤岗"},{"short_py":"heihe","pinyin":"heihe","cid":"59","name":"黑河"},{"short_py":"ha","pinyin":"huaian","cid":"71","name":"淮安"},{"short_py":"hz","pinyin":"hangzhou","cid":"78","name":"杭州"},{"short_py":"huzhou","pinyin":"huzhou","cid":"79","name":"湖州"},{"short_py":"hf","pinyin":"hefei","cid":"87","name":"合肥"},{"short_py":"hn","pinyin":"huainan","cid":"90","name":"淮南"},{"short_py":"huaibei","pinyin":"huaibei","cid":"92","name":"淮北"},{"short_py":"huangshan","pinyin":"huangshan","cid":"95","name":"黄山"},{"short_py":"heze","pinyin":"heze","cid":"124","name":"菏泽"},{"short_py":"hb","pinyin":"hebi","cid":"153","name":"鹤壁"},{"short_py":"hshi","pinyin":"huangshi","cid":"164","name":"黄石"},{"short_py":"hg","pinyin":"huanggang","cid":"163","name":"黄冈"},{"short_py":"hy","pinyin":"hengyang","cid":"180","name":"衡阳"},{"short_py":"hh","pinyin":"huaihua","cid":"188","name":"怀化"},{"short_py":"huizhou","pinyin":"huizhou","cid":"195","name":"惠州"},{"short_py":"heyuan","pinyin":"heyuan","cid":"206","name":"河源"},{"short_py":"hezhou","pinyin":"hezhou","cid":"314","name":"贺州"},{"short_py":"hc","pinyin":"hechi","cid":"319","name":"河池"},{"short_py":"haikou","pinyin":"haikou","cid":"255","name":"海口"},{"short_py":"honghe","pinyin":"honghe","cid":"278","name":"红河"},{"short_py":"hanzhong","pinyin":"hanzhong","cid":"304","name":"汉中"},{"short_py":"haidong","pinyin":"haidong","cid":"291","name":"海东"},{"short_py":"haibei","pinyin":"haibei","cid":"289","name":"海北"},{"short_py":"huangnan","pinyin":"huangnan","cid":"292","name":"黄南"},{"short_py":"hainan","pinyin":"hainan","cid":"293","name":"海南藏族"},{"short_py":"hx","pinyin":"haixi","cid":"296","name":"海西"},{"short_py":"hami","pinyin":"hami","cid":"334","name":"哈密"},{"short_py":"ht","pinyin":"hetian","cid":"335","name":"和田"},{"short_py":null,"pinyin":"hualianxian","cid":"712600","name":"花莲"},{"short_py":"hw","pinyin":"haiwai","cid":"405","name":"海外"}],"j":[{"short_py":"jincheng","pinyin":"jincheng","cid":"23","name":"晋城"},{"short_py":"jz","pinyin":"jinzhong","cid":"21","name":"晋中"},{"short_py":"jinzhou","pinyin":"jinzhou","cid":"34","name":"锦州"},{"short_py":"jl","pinyin":"jilin","cid":"42","name":"吉林"},{"short_py":"jixi","pinyin":"jixi","cid":"52","name":"鸡西"},{"short_py":"jms","pinyin":"jiamusi","cid":"55","name":"佳木斯"},{"short_py":"su","pinyin":"jiangsusuzhou","cid":"66","name":"苏州"},{"short_py":"jx","pinyin":"jiaxing","cid":"80","name":"嘉兴"},{"short_py":"jh","pinyin":"jinhua","cid":"85","name":"金华"},{"short_py":"jdz","pinyin":"jingdezhen","cid":"122","name":"景德镇"},{"short_py":"jj","pinyin":"jiujiang","cid":"116","name":"九江"},{"short_py":"ja","pinyin":"jian","cid":"120","name":"吉安"},{"short_py":"yichun","pinyin":"jiangxiyichun","cid":"119","name":"宜春"},{"short_py":"jn","pinyin":"jinan","cid":"125","name":"济南"},{"short_py":"jining","pinyin":"jining","cid":"131","name":"济宁"},{"short_py":"jiaozuo","pinyin":"jiaozuo","cid":"152","name":"焦作"},{"short_py":"jiyuan","pinyin":"jiyuan","cid":"151","name":"济源"},{"short_py":"jingmen","pinyin":"jingmen","cid":"172","name":"荆门"},{"short_py":"jingzhou","pinyin":"jingzhou","cid":"166","name":"荆州"},{"short_py":"jm","pinyin":"jiangmen","cid":"196","name":"江门"},{"short_py":"jy","pinyin":"jieyang","cid":"193","name":"揭阳"},{"short_py":"jyg","pinyin":"jiayuguan","cid":"215","name":"嘉峪关"},{"short_py":"jinchang","pinyin":"jinchang","cid":"212","name":"金昌"},{"short_py":"jq","pinyin":"jiuquan","cid":"219","name":"酒泉"},{"short_py":null,"pinyin":"jinmenxian","cid":"710500","name":"金门"},{"short_py":"jl","pinyin":"jilong","cid":"365","name":"基隆"},{"short_py":"jy","pinyin":"jiayi","cid":"369","name":"嘉义"},{"short_py":null,"pinyin":"jiayixian","cid":"711900","name":"嘉义"},{"short_py":null,"pinyin":"jiulong","cid":"810200","name":"九龙"}],"k":[{"short_py":"kaifeng","pinyin":"kaifeng","cid":"149","name":"开封"},{"short_py":"km","pinyin":"kunming","cid":"276","name":"昆明"},{"short_py":"klmy","pinyin":"kelamayi","cid":"339","name":"克拉玛依"},{"short_py":"kzls","pinyin":"kezilesu","cid":"337","name":"克孜勒苏柯尔克孜"},{"short_py":"ks","pinyin":"kashi","cid":"348","name":"喀什"}],"l":[{"short_py":"lf","pinyin":"langfang","cid":"11","name":"廊坊"},{"short_py":"linfen","pinyin":"linfen","cid":"24","name":"临汾"},{"short_py":"lvliang","pinyin":"lvliang","cid":"25","name":"吕梁"},{"short_py":"liaoyang","pinyin":"liaoyang","cid":"37","name":"辽阳"},{"short_py":"liaoyuan","pinyin":"liaoyuan","cid":"47","name":"辽源"},{"short_py":"lyg","pinyin":"lianyungang","cid":"72","name":"连云港"},{"short_py":"lishui","pinyin":"lishui","cid":"84","name":"丽水"},{"short_py":"la","pinyin":"liuan","cid":"100","name":"六安"},{"short_py":"ly","pinyin":"longyan","cid":"110","name":"龙岩"},{"short_py":"lw","pinyin":"laiwu","cid":"139","name":"莱芜"},{"short_py":"linyi","pinyin":"linyi","cid":"133","name":"临沂"},{"short_py":"lc","pinyin":"liaocheng","cid":"140","name":"聊城"},{"short_py":"luoyang","pinyin":"luoyang","cid":"150","name":"洛阳"},{"short_py":"luohe","pinyin":"luohe","cid":"156","name":"漯河"},{"short_py":"ld","pinyin":"loudi","cid":"184","name":"娄底"},{"short_py":"liuzhou","pinyin":"liuzhou","cid":"311","name":"柳州"},{"short_py":"lb","pinyin":"laibin","cid":"310","name":"来宾"},{"short_py":"lg","pinyin":"lingao","cid":"266","name":"临高"},{"short_py":"ld","pinyin":"ledong","cid":"269","name":"乐东"},{"short_py":"ls","pinyin":"lingshui","cid":"270","name":"陵水"},{"short_py":"luzhou","pinyin":"luzhou","cid":"234","name":"泸州"},{"short_py":"ls","pinyin":"leshan","cid":"238","name":"乐山"},{"short_py":"liangshan","pinyin":"liangshan","cid":"240","name":"凉山"},{"short_py":"lps","pinyin":"liupanshui","cid":"253","name":"六盘水"},{"short_py":"lj","pinyin":"lijiang","cid":"288","name":"丽江"},{"short_py":"lincang","pinyin":"lincang","cid":"285","name":"临沧"},{"short_py":"lasa","pinyin":"lasa","cid":"321","name":"拉萨"},{"short_py":"linzhi","pinyin":"linzhi","cid":"324","name":"林芝"},{"short_py":"lz","pinyin":"lanzhou","cid":"211","name":"兰州"},{"short_py":"ln","pinyin":"longnan","cid":"222","name":"陇南"},{"short_py":"linxia","pinyin":"linxia","cid":"223","name":"临夏"},{"short_py":null,"pinyin":"lianjiangxian","cid":"712800","name":"连江"}],"m":[{"short_py":"mdj","pinyin":"mudanjiang","cid":"53","name":"牡丹江"},{"short_py":"mas","pinyin":"maanshan","cid":"91","name":"马鞍山"},{"short_py":"mm","pinyin":"maoming","cid":"194","name":"茂名"},{"short_py":"mz","pinyin":"meizhou","cid":"198","name":"梅州"},{"short_py":"mianyang","pinyin":"mianyang","cid":"228","name":"绵阳"},{"short_py":"ms","pinyin":"meishan","cid":"239","name":"眉山"},{"short_py":null,"pinyin":"miaolixian","cid":"711500","name":"苗栗"}],"n":[{"short_py":"nj","pinyin":"nanjing","cid":"63","name":"南京"},{"short_py":"nt","pinyin":"nantong","cid":"67","name":"南通"},{"short_py":"nb","pinyin":"ningbo","cid":"81","name":"宁波"},{"short_py":"np","pinyin":"nanping","cid":"112","name":"南平"},{"short_py":"nd","pinyin":"ningde","cid":"106","name":"宁德"},{"short_py":"nc","pinyin":"nanchang","cid":"115","name":"南昌"},{"short_py":"ny","pinyin":"nanyang","cid":"148","name":"南阳"},{"short_py":"nn","pinyin":"nanning","cid":"308","name":"南宁"},{"short_py":"scnj","pinyin":"neijiang","cid":"237","name":"内江"},{"short_py":"nanchong","pinyin":"nanchong","cid":"229","name":"南充"},{"short_py":"nujiang","pinyin":"nujiang","cid":"286","name":"怒江"},{"short_py":"nq","pinyin":"naqu","cid":"326","name":"那曲"},{"short_py":null,"pinyin":"nantouxian","cid":"710600","name":"南投"}],"p":[{"short_py":"pj","pinyin":"panjin","cid":"39","name":"盘锦"},{"short_py":"pt","pinyin":"putian","cid":"107","name":"莆田"},{"short_py":"px","pinyin":"pingxiang","cid":"123","name":"萍乡"},{"short_py":"pds","pinyin":"pingdingshan","cid":"146","name":"平顶山"},{"short_py":"puyang","pinyin":"puyang","cid":"154","name":"濮阳"},{"short_py":"panzhihua","pinyin":"panzhihua","cid":"226","name":"攀枝花"},{"short_py":"pe","pinyin":"puer","cid":"284","name":"普洱"},{"short_py":"pl","pinyin":"pingliang","cid":"218","name":"平凉"},{"short_py":null,"pinyin":"pingdongxian","cid":"712400","name":"屏东"},{"short_py":null,"pinyin":"penghuxian","cid":"712700","name":"澎湖"}],"q":[{"short_py":"qhd","pinyin":"qinhuangdao","cid":"15","name":"秦皇岛"},{"short_py":"qqhr","pinyin":"qiqihaer","cid":"51","name":"齐齐哈尔"},{"short_py":"qth","pinyin":"qitaihe","cid":"54","name":"七台河"},{"short_py":"quzhou","pinyin":"quzhou","cid":"77","name":"衢州"},{"short_py":"qz","pinyin":"quanzhou","cid":"108","name":"泉州"},{"short_py":"qd","pinyin":"qingdao","cid":"126","name":"青岛"},{"short_py":"qianjiang","pinyin":"qianjiang","cid":"175","name":"潜江"},{"short_py":"qingyuan","pinyin":"qingyuan","cid":"207","name":"清远"},{"short_py":"qinzhou","pinyin":"qinzhou","cid":"318","name":"钦州"},{"short_py":"qh","pinyin":"qionghai","cid":"258","name":"琼海"},{"short_py":"qz","pinyin":"qiongzhong","cid":"272","name":"琼中"},{"short_py":"qxn","pinyin":"qianxinan","cid":"254","name":"黔西南"},{"short_py":"qdn","pinyin":"qiandongnan","cid":"250","name":"黔东南"},{"short_py":"qn","pinyin":"qiannan","cid":"249","name":"黔南"},{"short_py":"qj","pinyin":"qujing","cid":"279","name":"曲靖"},{"short_py":"qingyang","pinyin":"qingyang","cid":"220","name":"庆阳"}],"r":[{"short_py":"rizhao","pinyin":"rizhao","cid":"138","name":"日照"},{"short_py":"rkz","pinyin":"rikaze","cid":"322","name":"日喀则"}],"s":[{"short_py":"sjz","pinyin":"shijiazhuang","cid":"6","name":"石家庄"},{"short_py":"shuozhou","pinyin":"shuozhou","cid":"16","name":"朔州"},{"short_py":"sy","pinyin":"shenyang","cid":"27","name":"沈阳"},{"short_py":"sp","pinyin":"siping","cid":"44","name":"四平"},{"short_py":"songyuan","pinyin":"songyuan","cid":"48","name":"松原"},{"short_py":"sys","pinyin":"shuangyashan","cid":"57","name":"双鸭山"},{"short_py":"suihua","pinyin":"suihua","cid":"58","name":"绥化"},{"short_py":"sh","pinyin":"shanghai","cid":"3","name":"上海"},{"short_py":"suqian","pinyin":"suqian","cid":"75","name":"宿迁"},{"short_py":"sx","pinyin":"shaoxing","cid":"82","name":"绍兴"},{"short_py":"suzhou","pinyin":"suzhou","cid":"98","name":"宿州"},{"short_py":"sm","pinyin":"sanming","cid":"111","name":"三明"},{"short_py":"sr","pinyin":"shangrao","cid":"117","name":"上饶"},{"short_py":"smx","pinyin":"sanmenxia","cid":"158","name":"三门峡"},{"short_py":"sq","pinyin":"shangqiu","cid":"141","name":"商丘"},{"short_py":"shiyan","pinyin":"shiyan","cid":"170","name":"十堰"},{"short_py":"suizhou","pinyin":"suizhou","cid":"171","name":"随州"},{"short_py":"snj","pinyin":"shennongjia","cid":"169","name":"神农架"},{"short_py":"shaoyang","pinyin":"shaoyang","cid":"185","name":"邵阳"},{"short_py":"sg","pinyin":"shaoguan","cid":"197","name":"韶关"},{"short_py":"sz","pinyin":"shenzhen","cid":"200","name":"深圳"},{"short_py":"st","pinyin":"shantou","cid":"199","name":"汕头"},{"short_py":"sw","pinyin":"shanwei","cid":"191","name":"汕尾"},{"short_py":"sanya","pinyin":"sanya","cid":"256","name":"三亚"},{"short_py":null,"pinyin":"sanshashi","cid":"460300","name":"三沙"},{"short_py":"suining","pinyin":"suining","cid":"231","name":"遂宁"},{"short_py":"sn","pinyin":"shannan","cid":"323","name":"山南"},{"short_py":"yl","pinyin":"shanxiyulin","cid":"300","name":"榆林"},{"short_py":"sl","pinyin":"shangluo","cid":"302","name":"商洛"},{"short_py":"szs","pinyin":"shizuishan","cid":"329","name":"石嘴山"},{"short_py":"shz","pinyin":"shihezi","cid":"341","name":"石河子"}],"t":[{"short_py":"tj","pinyin":"tianjin","cid":"2","name":"天津"},{"short_py":"ts","pinyin":"tangshan","cid":"10","name":"唐山"},{"short_py":"ty","pinyin":"taiyuan","cid":"18","name":"太原"},{"short_py":"tongliao","pinyin":"tongliao","cid":"356","name":"通辽"},{"short_py":"tl","pinyin":"tieling","cid":"28","name":"铁岭"},{"short_py":"th","pinyin":"tonghua","cid":"45","name":"通化"},{"short_py":"taizhou","pinyin":"taizhou","cid":"74","name":"泰州"},{"short_py":"tongling","pinyin":"tongling","cid":"93","name":"铜陵"},{"short_py":"ta","pinyin":"taian","cid":"132","name":"泰安"},{"short_py":"tm","pinyin":"tianmen","cid":"174","name":"天门"},{"short_py":"tc","pinyin":"tunchang","cid":"265","name":"屯昌"},{"short_py":"tr","pinyin":"tongren","cid":"251","name":"铜仁"},{"short_py":"tc","pinyin":"tongchuan","cid":"306","name":"铜川"},{"short_py":"tianshui","pinyin":"tianshui","cid":"214","name":"天水"},{"short_py":"tlf","pinyin":"tulufan","cid":"344","name":"吐鲁番"},{"short_py":"tc","pinyin":"tangcheng","cid":"333","name":"塔城"},{"short_py":"tmsk","pinyin":"tumushuke","cid":"349","name":"图木舒克"},{"short_py":"tb","pinyin":"taibei","cid":"363","name":"台北"},{"short_py":"tn","pinyin":"tainan","cid":"367","name":"台南"},{"short_py":"tz","pinyin":"taizhong","cid":"366","name":"台中"},{"short_py":null,"pinyin":"taoyuanxian","cid":"711400","name":"桃园"},{"short_py":null,"pinyin":"taidongxian","cid":"712500","name":"台东"}],"w":[{"short_py":"wuhai","pinyin":"wuhai","cid":"354","name":"乌海"},{"short_py":"wlcb","pinyin":"wulanchabu","cid":"355","name":"乌兰察布"},{"short_py":"wx","pinyin":"wuxi","cid":"64","name":"无锡"},{"short_py":"wz","pinyin":"wenzhou","cid":"83","name":"温州"},{"short_py":"wuhu","pinyin":"wuhu","cid":"88","name":"芜湖"},{"short_py":"wf","pinyin":"weifang","cid":"130","name":"潍坊"},{"short_py":"weihai","pinyin":"weihai","cid":"136","name":"威海"},{"short_py":"wh","pinyin":"wuhan","cid":"159","name":"武汉"},{"short_py":"wuzhou","pinyin":"wuzhou","cid":"313","name":"梧州"},{"short_py":"wzs","pinyin":"wuzhishan","cid":"257","name":"五指山"},{"short_py":"wc","pinyin":"wenchang","cid":"260","name":"文昌"},{"short_py":"wn","pinyin":"wanning","cid":"261","name":"万宁"},{"short_py":"ws","pinyin":"wenshan","cid":"281","name":"文山"},{"short_py":"wn","pinyin":"weinan","cid":"301","name":"渭南"},{"short_py":"wuwei","pinyin":"wuwei","cid":"216","name":"武威"},{"short_py":"wuzhong","pinyin":"wuzhong","cid":"330","name":"吴忠"},{"short_py":"wlmq","pinyin":"wulumuqi","cid":"340","name":"乌鲁木齐"},{"short_py":"wjq","pinyin":"wujiaqu","cid":"343","name":"五家渠"}],"x":[{"short_py":"xt","pinyin":"xingtai","cid":"14","name":"邢台"},{"short_py":"xinzhou","pinyin":"xinzhou","cid":"17","name":"忻州"},{"short_py":"xam","pinyin":"xinganmeng","cid":"361","name":"兴安"},{"short_py":"xl","pinyin":"xilinguolemeng","cid":"360","name":"锡林郭勒"},{"short_py":"xz","pinyin":"xuzhou","cid":"70","name":"徐州"},{"short_py":"xuancheng","pinyin":"xuancheng","cid":"103","name":"宣城"},{"short_py":"xm","pinyin":"xiamen","cid":"105","name":"厦门"},{"short_py":"xinyu","pinyin":"xinyu","cid":"114","name":"新余"},{"short_py":"xx","pinyin":"xinxiang","cid":"144","name":"新乡"},{"short_py":"xc","pinyin":"xuchang","cid":"145","name":"许昌"},{"short_py":"xy","pinyin":"xinyang","cid":"147","name":"信阳"},{"short_py":"xf","pinyin":"xiangyang","cid":"392","name":"襄阳"},{"short_py":"xiaogan","pinyin":"xiaogan","cid":"162","name":"孝感"},{"short_py":"xianning","pinyin":"xianning","cid":"165","name":"咸宁"},{"short_py":"xiantao","pinyin":"xiantao","cid":"173","name":"仙桃"},{"short_py":"xiangtan","pinyin":"xiangtan","cid":"178","name":"湘潭"},{"short_py":"xiangxi","pinyin":"xiangxi","cid":"186","name":"湘西"},{"short_py":"bn","pinyin":"xishuangbanna","cid":"273","name":"西双版纳"},{"short_py":"xa","pinyin":"xian","cid":"297","name":"西安"},{"short_py":"xianyang","pinyin":"xianyang","cid":"298","name":"咸阳"},{"short_py":"xn","pinyin":"xining","cid":"290","name":"西宁"},{"short_py":"xz","pinyin":"xinzhu","cid":"368","name":"新竹"},{"short_py":null,"pinyin":"xinbeishi","cid":"711100","name":"新北"},{"short_py":null,"pinyin":"xinzhuxian","cid":"711300","name":"新竹"},{"short_py":null,"pinyin":"xianggangdao","cid":"371","name":"香港岛"},{"short_py":null,"pinyin":"xinjie","cid":"810300","name":"新界"}],"y":[{"short_py":"yq","pinyin":"yangquan","cid":"20","name":"阳泉"},{"short_py":"yuncheng","pinyin":"yuncheng","cid":"26","name":"运城"},{"short_py":"yk","pinyin":"yingkou","cid":"35","name":"营口"},{"short_py":"yanbian","pinyin":"yanbian","cid":"43","name":"延边朝鲜族"},{"short_py":"yich","pinyin":"yichun","cid":"61","name":"伊春"},{"short_py":"yancheng","pinyin":"yancheng","cid":"69","name":"盐城"},{"short_py":"yz","pinyin":"yangzhou","cid":"68","name":"扬州"},{"short_py":"yingtan","pinyin":"yingtan","cid":"113","name":"鹰潭"},{"short_py":"yt","pinyin":"yantai","cid":"129","name":"烟台"},{"short_py":"yc","pinyin":"yichang","cid":"167","name":"宜昌"},{"short_py":"yy","pinyin":"yueyang","cid":"176","name":"岳阳"},{"short_py":"yiyang","pinyin":"yiyang","cid":"183","name":"益阳"},{"short_py":"yongzhou","pinyin":"yongzhou","cid":"189","name":"永州"},{"short_py":"yj","pinyin":"yangjiang","cid":"192","name":"阳江"},{"short_py":"yf","pinyin":"yunfu","cid":"208","name":"云浮"},{"short_py":"yulin","pinyin":"yulin","cid":"316","name":"玉林"},{"short_py":"yb","pinyin":"yibin","cid":"235","name":"宜宾"},{"short_py":"ya","pinyin":"yaan","cid":"241","name":"雅安"},{"short_py":"yx","pinyin":"yuxi","cid":"282","name":"玉溪"},{"short_py":"yanan","pinyin":"yanan","cid":"299","name":"延安"},{"short_py":"ys","pinyin":"yushu","cid":"295","name":"玉树"},{"short_py":"yinchuan","pinyin":"yinchuan","cid":"328","name":"银川"},{"short_py":"yili","pinyin":"yili","cid":"350","name":"伊犁"},{"short_py":null,"pinyin":"yilanxian","cid":"711200","name":"宜兰"},{"short_py":null,"pinyin":"yunlinxian","cid":"712100","name":"云林"}],"z":[{"short_py":"zjk","pinyin":"zhangjiakou","cid":"8","name":"张家口"},{"short_py":"zj","pinyin":"zhenjiang","cid":"65","name":"镇江"},{"short_py":"zhoushan","pinyin":"zhoushan","cid":"76","name":"舟山"},{"short_py":"tz","pinyin":"zhejiangtaizhou","cid":"86","name":"台州"},{"short_py":"zhangzhou","pinyin":"zhangzhou","cid":"109","name":"漳州"},{"short_py":"zb","pinyin":"zibo","cid":"127","name":"淄博"},{"short_py":"zaozhuang","pinyin":"zaozhuang","cid":"137","name":"枣庄"},{"short_py":"zz","pinyin":"zhengzhou","cid":"142","name":"郑州"},{"short_py":"zk","pinyin":"zhoukou","cid":"155","name":"周口"},{"short_py":"zmd","pinyin":"zhumadian","cid":"157","name":"驻马店"},{"short_py":"zhuzhou","pinyin":"zhuzhou","cid":"179","name":"株洲"},{"short_py":"zjj","pinyin":"zhangjiajie","cid":"187","name":"张家界"},{"short_py":"zh","pinyin":"zhuhai","cid":"201","name":"珠海"},{"short_py":"zhanjiang","pinyin":"zhanjiang","cid":"204","name":"湛江"},{"short_py":"zq","pinyin":"zhaoqing","cid":"203","name":"肇庆"},{"short_py":"zs","pinyin":"zhongshan","cid":"205","name":"中山"},{"short_py":"zg","pinyin":"zigong","cid":"227","name":"自贡"},{"short_py":"zy","pinyin":"ziyang","cid":"236","name":"资阳"},{"short_py":"zunyi","pinyin":"zunyi","cid":"247","name":"遵义"},{"short_py":"zt","pinyin":"zhaotong","cid":"275","name":"昭通"},{"short_py":"zhangye","pinyin":"zhangye","cid":"217","name":"张掖"},{"short_py":"zw","pinyin":"zhongwei","cid":"332","name":"中卫"},{"short_py":null,"pinyin":"zhanghuaxian","cid":"711700","name":"彰化"}]},"hot_city":[{"cid":78,"name":"杭州","pinyin":"hangzhou"},{"cid":1,"name":"北京","pinyin":"beijing"},{"cid":3,"name":"上海","pinyin":"shanghai"},{"cid":200,"name":"深圳","pinyin":"shenzhen"},{"cid":297,"name":"西安","pinyin":"xian"},{"cid":225,"name":"成都","pinyin":"chengdu"},{"cid":190,"name":"广州","pinyin":"guangzhou"},{"cid":159,"name":"武汉","pinyin":"wuhan"},{"cid":63,"name":"南京","pinyin":"nanjing"},{"cid":4,"name":"重庆","pinyin":"chongqing"},{"cid":66,"name":"苏州","pinyin":"jiangsusuzhou"},{"cid":2,"name":"天津","pinyin":"tianjin"},{"cid":105,"name":"厦门","pinyin":"xiamen"},{"cid":256,"name":"三亚","pinyin":"sanya"},{"cid":177,"name":"长沙","pinyin":"changsha"},{"cid":142,"name":"郑州","pinyin":"zhengzhou"}],"relative_city":[{"name":null,"cid":"256"}]}
     * current_time : 1471923506
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
        private ListBean list;
        /**
         * cid : 78
         * name : 杭州
         * pinyin : hangzhou
         */

        private List<HotCityBean> hot_city;
        /**
         * name : null
         * cid : 256
         */

        private List<RelativeCityBean> relative_city;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public List<HotCityBean> getHot_city() {
            return hot_city;
        }

        public void setHot_city(List<HotCityBean> hot_city) {
            this.hot_city = hot_city;
        }

        public List<RelativeCityBean> getRelative_city() {
            return relative_city;
        }

        public void setRelative_city(List<RelativeCityBean> relative_city) {
            this.relative_city = relative_city;
        }

        public static class ListBean {
            /**
             * short_py : alsm
             * pinyin : alashanmeng
             * cid : 362
             * name : 阿拉善
             */

            private List<ABean> a;
            /**
             * short_py : bj
             * pinyin : beijing
             * cid : 1
             * name : 北京
             */

            private List<BBean> b;
            /**
             * short_py : chengde
             * pinyin : chengde
             * cid : 9
             * name : 承德
             */

            private List<CBean> c;
            /**
             * short_py : dt
             * pinyin : datong
             * cid : 19
             * name : 大同
             */

            private List<DBean> d;
            /**
             * short_py : erds
             * pinyin : eerduosi
             * cid : 358
             * name : 鄂尔多斯
             */

            private List<EBean> e;
            /**
             * short_py : fushun
             * pinyin : fushun
             * cid : 31
             * name : 抚顺
             */

            private List<FBean> f;
            /**
             * short_py : ganzhou
             * pinyin : ganzhou
             * cid : 121
             * name : 赣州
             */

            private List<GBean> g;
            /**
             * short_py : hd
             * pinyin : handan
             * cid : 5
             * name : 邯郸
             */

            private List<HBean> h;
            /**
             * short_py : jincheng
             * pinyin : jincheng
             * cid : 23
             * name : 晋城
             */

            private List<JBean> j;
            /**
             * short_py : kaifeng
             * pinyin : kaifeng
             * cid : 149
             * name : 开封
             */

            private List<KBean> k;
            /**
             * short_py : lf
             * pinyin : langfang
             * cid : 11
             * name : 廊坊
             */

            private List<LBean> l;
            /**
             * short_py : mdj
             * pinyin : mudanjiang
             * cid : 53
             * name : 牡丹江
             */

            private List<MBean> m;
            /**
             * short_py : nj
             * pinyin : nanjing
             * cid : 63
             * name : 南京
             */

            private List<NBean> n;
            /**
             * short_py : pj
             * pinyin : panjin
             * cid : 39
             * name : 盘锦
             */

            private List<PBean> p;
            /**
             * short_py : qhd
             * pinyin : qinhuangdao
             * cid : 15
             * name : 秦皇岛
             */

            private List<QBean> q;
            /**
             * short_py : rizhao
             * pinyin : rizhao
             * cid : 138
             * name : 日照
             */

            private List<RBean> r;
            /**
             * short_py : sjz
             * pinyin : shijiazhuang
             * cid : 6
             * name : 石家庄
             */

            private List<SBean> s;
            /**
             * short_py : tj
             * pinyin : tianjin
             * cid : 2
             * name : 天津
             */

            private List<TBean> t;
            /**
             * short_py : wuhai
             * pinyin : wuhai
             * cid : 354
             * name : 乌海
             */

            private List<WBean> w;
            /**
             * short_py : xt
             * pinyin : xingtai
             * cid : 14
             * name : 邢台
             */

            private List<XBean> x;
            /**
             * short_py : yq
             * pinyin : yangquan
             * cid : 20
             * name : 阳泉
             */

            private List<YBean> y;
            /**
             * short_py : zjk
             * pinyin : zhangjiakou
             * cid : 8
             * name : 张家口
             */

            private List<ZBean> z;

            public List<ABean> getA() {
                return a;
            }

            public void setA(List<ABean> a) {
                this.a = a;
            }

            public List<BBean> getB() {
                return b;
            }

            public void setB(List<BBean> b) {
                this.b = b;
            }

            public List<CBean> getC() {
                return c;
            }

            public void setC(List<CBean> c) {
                this.c = c;
            }

            public List<DBean> getD() {
                return d;
            }

            public void setD(List<DBean> d) {
                this.d = d;
            }

            public List<EBean> getE() {
                return e;
            }

            public void setE(List<EBean> e) {
                this.e = e;
            }

            public List<FBean> getF() {
                return f;
            }

            public void setF(List<FBean> f) {
                this.f = f;
            }

            public List<GBean> getG() {
                return g;
            }

            public void setG(List<GBean> g) {
                this.g = g;
            }

            public List<HBean> getH() {
                return h;
            }

            public void setH(List<HBean> h) {
                this.h = h;
            }

            public List<JBean> getJ() {
                return j;
            }

            public void setJ(List<JBean> j) {
                this.j = j;
            }

            public List<KBean> getK() {
                return k;
            }

            public void setK(List<KBean> k) {
                this.k = k;
            }

            public List<LBean> getL() {
                return l;
            }

            public void setL(List<LBean> l) {
                this.l = l;
            }

            public List<MBean> getM() {
                return m;
            }

            public void setM(List<MBean> m) {
                this.m = m;
            }

            public List<NBean> getN() {
                return n;
            }

            public void setN(List<NBean> n) {
                this.n = n;
            }

            public List<PBean> getP() {
                return p;
            }

            public void setP(List<PBean> p) {
                this.p = p;
            }

            public List<QBean> getQ() {
                return q;
            }

            public void setQ(List<QBean> q) {
                this.q = q;
            }

            public List<RBean> getR() {
                return r;
            }

            public void setR(List<RBean> r) {
                this.r = r;
            }

            public List<SBean> getS() {
                return s;
            }

            public void setS(List<SBean> s) {
                this.s = s;
            }

            public List<TBean> getT() {
                return t;
            }

            public void setT(List<TBean> t) {
                this.t = t;
            }

            public List<WBean> getW() {
                return w;
            }

            public void setW(List<WBean> w) {
                this.w = w;
            }

            public List<XBean> getX() {
                return x;
            }

            public void setX(List<XBean> x) {
                this.x = x;
            }

            public List<YBean> getY() {
                return y;
            }

            public void setY(List<YBean> y) {
                this.y = y;
            }

            public List<ZBean> getZ() {
                return z;
            }

            public void setZ(List<ZBean> z) {
                this.z = z;
            }

            public static class ABean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class BBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class CBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class EBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class FBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class GBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class HBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class JBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class KBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class LBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class NBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class PBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class QBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class RBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class WBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class XBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class YBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ZBean {
                private String short_py;
                private String pinyin;
                private String cid;
                private String name;
                private int type = 1;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }
                public String getShort_py() {
                    return short_py;
                }

                public void setShort_py(String short_py) {
                    this.short_py = short_py;
                }

                public String getPinyin() {
                    return pinyin;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class HotCityBean implements Serializable{
            private int cid;
            private String name;
            private String pinyin;
            private int type = 1;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
            public int getCid() {
                return cid;
            }

            public void setCid(int cid) {
                this.cid = cid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPinyin() {
                return pinyin;
            }

            public void setPinyin(String pinyin) {
                this.pinyin = pinyin;
            }
        }

        public static class RelativeCityBean {
            private Object name;
            private String cid;
            private int type = 1;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
            public Object getName() {
                return name;
            }

            public void setName(Object name) {
                this.name = name;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }
        }
    }
}
