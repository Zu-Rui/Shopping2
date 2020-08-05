package com.example.shopping.app;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Egdd {
    /**
     * bbvideo_android : {"ab_test_switch":"0","ab_test_data":{"ab_splash_show":"1","ab_pre_show":"0","ab_video_status":"0","ab_audio_status":"0","ab_channel":"vivo"},"banner2_show_switch":"1","banner2_not_show_rule":"","switch_banner":"0","information_flow_switch":"1","video_title_banner_show":"0","audio_title_banner_show":"0","ad_animation":"1","video_complete_ad":"0","patch_ad_tail":"","ad_timeout_request":"1","ad_source":"1","ad_float_show":"1","gdt_ad_source":"1","baidu_ad_source":"1","csj_ad_source":"1","reward_video_show":"1","unlock_ad_show":"0","exit_ad_show":"0","baidu_ad_tactics_show":"1","xiaomi_test":{"start_timeout":"0","start_failed_repull":"0","start_report":"1","ad_request_api":"1","ab_splash_show":"1"}}
     * bbvideo_android_debug : {"ab_test_switch":"0","ab_test_data":{"ab_splash_show":"1","ab_pre_show":"0","ab_video_status":"0","ab_audio_status":"0","ab_channel":"vivo"},"banner2_show_switch":"1","banner2_not_show_rule":"","switch_banner":"1","information_flow_switch":"1","video_title_banner_show":"0","audio_title_banner_show":"0","ad_animation":"1","video_complete_ad":"0","patch_ad_tail":"0,1,2,3,4,5,6,7,8,9","ad_timeout_request":"1","ad_source":"1","ad_float_show":"0","gdt_ad_source":"1","baidu_ad_source":"1","csj_ad_source":"1","reward_video_show":"1","unlock_ad_show":"1","exit_ad_show":"1","baidu_ad_tactics_show":"1","xiaomi_test":{"start_timeout":"0","start_failed_repull":"0","start_report":"1","ad_request_api":"1","ab_splash_show":"1"}}
     * bbvideo_banner_android : {"video_data":[]}
     * bbvideo_banner_android_debug : {"album_data":"","video_data":""}
     * ergedd_android : {"banner2_show":"1","banner2_not_show":"","switch_ad":"0","information_flow_switch":"0","ad_animation":"1","video_complete_ad":"0","patch_ad_tail":"3,6,9","ad_timeout_request":"1","ad_source":"1","ad_float_show":"0","gdt_ad_source":"1","baidu_ad_source":"1","csj_ad_source":"1","reward_video_show":"1","unlock_ad_show":"0","exit_ad_show":"1","baidu_ad_tactics_show":"1","temp_custom_ad_show":"0","temp_custom_ad_limit":"0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f","ad_api_source":"v1","is_new_ad_api":"1","xiaomi_test":{"start_timeout":"0","start_failed_repull":"0","start_report":"1","ad_request_api":"1","ab_splash_show":"0"}}
     * ergedd_android_debug : {"banner2_show":"1","banner2_not_show":"","switch_ad":"0","information_flow_switch":"0","ad_animation":"1","video_complete_ad":"0","patch_ad_tail":"3,6,9","ad_timeout_request":"1","ad_source":"1","ad_float_show":"0","gdt_ad_source":"1","baidu_ad_source":"1","csj_ad_source":"1","reward_video_show":"1","unlock_ad_show":"1","exit_ad_show":"1","baidu_ad_tactics_show":"1","temp_custom_ad_show":"1","temp_custom_ad_limit":"0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f","ad_api_source":"v1","is_new_ad_api":"1","xiaomi_test":{"start_timeout":"1","start_failed_repull":"1","start_report":"1","ad_request_api":"1","ab_splash_show":"0"}}
     * ergedd_banner_android : {"album_data":[],"video_data":[]}
     * ergedd_banner_android_debug : {"album_data":[],"video_data":[]}
     * bbvideo_ios : {"splash_show":"0","infoflow_show":"1","tt_banner_show":"1","small_banner_show":"1","ad_num":"1","free_dur":"20","useNewBannerAdType":"1","homeStopRetry":"0","ad_float_show":"1"}
     * bbvideo_banner_ios : {"album_data":[{"album_name":"经典中文儿歌","album_id":["2"],"baidu_appsid":"b654441f","baidu_bannerid":"6064632","baidu1_appsid":"b654441f","baidu1_bannerid":"6064633"}],"video_data":[{"video_name":"小猪佩奇3","video_id":["9941","9942","9943","9944","9945","9946","9947","9948","9949","9950","9951","9952","9953","9954","9955","9956","9957","9958","9959","9960","17111","9961","9962","9963","9964","9965","5880","5881","5882","5883","5884","5885","5886","5887","5888","5889","5890","5891","5892"],"baidu_appsid":"b654441f","baidu_bannerid":"6064628","baidu1_appsid":"b654441f","baidu1_bannerid":"6064631"},{"video_name":"小猪佩奇其他","video_id":["9966","9967","9848","9849","9850","9851","9852","9968","9969","9934","9971","9972","9973","9974","9977","9975","9976","9978","9979","9980","9981","9982","9983","9984","9985","9986","9987","9988","9989","9990","9991","9992","9993","9994","9995","9996","9997","9998","9999","10000","10001","10002","10003","10004","10005","10006","17059","10008","10009","10010","10011","10012","5050","5055","5052","5048","5560","5559","5049","5051","5057","5053","5558","5054","5056","5555","5561","5562","5563","5556","5564","5565","9935","9936","9937","9938","9939","9940","5893","5894","5895","5896","5897","5898","5899","5900","5901","5902","5903","5904","5905","5906","5907","9932","5908","5909","5910","5911","5912","5913","5914","5915","5916","5917","5918","5919","5920","5921","5922","5923","5924","5925","5926","5927","5928","5929","5930"],"baidu_appsid":"b654441f","baidu_bannerid":"6064632","baidu1_appsid":"b654441f","baidu1_bannerid":"6064633"}]}
     * ergedd_ios : {"infoflow_show_ergedd":"0","small_banner_show_ergedd":"1","ad_num":"1","free_dur":"20","useNewBannerAdType_ergedd":"0","homeStopRetry_ergedd":"0","ad_float_show_ergedd":"1","ad_float_compute_show_ergedd":"1","video_complete_ad":"1","patch_ad_tail":"3,6,9","PlacementId_banner1":"","PlacementId_banner3":"","useNewBannerAdType_ergedd_v2":"1","show_BaiDu_55_ergedd":"1","useNewBannerAdType_ergedd_v3":"1","isBUser_QMB_2_Close":"0","isBUser_QMB_iPad_Close":"0"}
     * other_a_2708 : {"success":true,"data":[{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/60195551261_1563877245671.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"萌鸡小队","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/532","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/96534051122_1563877303611.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"status":"1","url":"ergedd://album/175","image_url":"http://img5g22.ergedd.com/admin/promotion/66208774742_1563877324077.png","short_image_url":"","horizontal_image_url":""}],"message":"Get app configs successfully"}
     * other_a_2726 : {"success":true,"data":[{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/60661304257_1569224434323.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"萌鸡小队","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/532","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/70224414740_1569224480488.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"status":"1","url":"ergedd://album/175","image_url":"http://img5g22.ergedd.com/admin/promotion/55116124360_1569224503190.png","short_image_url":"","horizontal_image_url":""},{"id":19,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"小马宝莉","channel":"","grade":0,"status":"1","url":"ergedd://album/233","image_url":"http://img5g22.ergedd.com/admin/promotion/1101992266_1569224560511.png","short_image_url":"","horizontal_image_url":""}],"message":"Get app configs successfully"}
     * other_i_2125 : {"success":true,"data":[{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","before_ad_proportion":"10:0:0","after_ad_proportion":"9:0:1","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","video_id":"","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","image_gif":"http://img5g22.ergedd.com/admin/promotion/27247947657_1570604919271.gif","short_image_url":"","horizontal_image_url":""},{"id":46,"group":"promotion_banner","field":"right-3TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-3","title":"巴塔木英文歌","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/10","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/14268770968_1564568296712.jpg","short_image_url":"","horizontal_image_url":""},{"id":45,"group":"promotion_banner","field":"right-4TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-4","title":"睡衣小英雄","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/649","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/96182197450_1564568352960.jpg","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/175","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/33472971605_1573804687717.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"超级飞侠","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/562","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/36170542987_1573804712860.png","short_image_url":"","horizontal_image_url":""}],"message":"Get app configs successfully"}
     * other_i_2129 : {"success":true,"message":"Get app configs successfully","data":[{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","before_ad_proportion":"10:0:0","after_ad_proportion":"9:0:1","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","video_id":"","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/61975926833_1576046042005.png","image_gif":"","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"萌鸡小队","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/532","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/64187463675_1576046119981.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/175","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/17058139865_1576046139785.png","short_image_url":"","horizontal_image_url":""},{"id":45,"group":"promotion_banner","field":"right-4TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-4","title":"睡衣小英雄","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/649","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/47766972914_1576143741974.png","short_image_url":"","horizontal_image_url":""},{"id":46,"group":"promotion_banner","field":"right-3TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-3","title":"小马宝莉","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/233","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/app_ads/79167589190_1589164693524.png","short_image_url":"","horizontal_image_url":""}]}
     * other_a_2808 : {"success":true,"data":[{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"超级飞侠","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/562","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/36170542987_1573804712860.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"status":"1","url":"ergedd://album/175","image_url":"http://img5g22.ergedd.com/admin/promotion/33472971605_1573804687717.png","short_image_url":"","horizontal_image_url":""}],"message":"Get app configs successfully"}
     * other_ia_2129 : {"success":true,"data":[{"id":95,"group":"promotion_audio_banner","field":"left","min_version":"","max_version":"","position":"left","title":"哈利讲故事","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://audio/playlist/258","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/89086820861_1576130752371.png","short_image_url":"","horizontal_image_url":""},{"id":96,"group":"promotion_audio_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"经典儿歌","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://audio/playlist/194","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/3750444586_1576130803746.png","short_image_url":"","horizontal_image_url":""},{"id":94,"group":"promotion_audio_banner","field":"right-top","min_version":"","max_version":"","position":"right-top","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://audio/playlist/261","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/32147354164_1576130783690.png","short_image_url":"","horizontal_image_url":""},{"id":101,"group":"promotion_audio_banner","field":"right-3","position":"right-3","title":"恐龙儿歌","channel":"","status":"1","url":"ergedd://audio/playlist/420","image_url":"http://img5g22.ergedd.com/admin/promotion/17054560114_1579516284762.png","short_image_url":"","horizontal_image_url":""},{"id":102,"group":"promotion_audio_banner","field":"right-4","position":"right-4","title":"动物儿歌","channel":"","status":"1","url":"ergedd://audio/playlist/251","image_url":"http://img5g22.ergedd.com/admin/promotion/19819593104_1576130883010.png","short_image_url":"","horizontal_image_url":""}],"message":"Get app configs successfully"}
     * other_a_newui12 : {"success":true,"data":[{"id":100,"name":"交通安全","image":"http://img5g22.ergedd.com/video/21163_1546062351866.jpg","type":"110"},{"id":101,"name":"睡前故事","image":"http://img5g22.ergedd.com/video/21163_1546062351866.jpg","type":"112"},{"id":102,"name":"生活好习惯","image":"http://img5g22.ergedd.com/video/21163_1546062351866.jpg","type":"113"}],"message":"Get album categories successfully"}
     * ergedd_greet_ios : [{"start":"6:00","end":"7:00"},{"start":"7:00","end":"8:00"},{"start":"8:00","end":"9:00"},{"start":"9:00","end":"11:00"},{"start":"11:00","end":"12:00"},{"start":"12:00","end":"17:00"},{"start":"17:00","end":"20:00"},{"start":"22:00","end":"0:00"}]
     * ergedd_greet_android : [{"start":"6:00","end":"7:00"},{"start":"7:00","end":"8:00"},{"start":"8:00","end":"9:00"},{"start":"9:00","end":"11:00"},{"start":"11:00","end":"12:00"},{"start":"12:00","end":"17:00"},{"start":"17:00","end":"20:00"},{"start":"22:00","end":"0:00"}]
     * other_a_200720 : {"success":true,"data":[{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"经典中文儿歌","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/575","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/app_ads/33735076246_1595301754734.jpg","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"恐龙儿歌","channel":"","grade":0,"status":"1","url":"ergedd://album/699","image_url":"http://img5g22.ergedd.com/admin/app_ads/96932284097_1595302619317.jpg","short_image_url":"","horizontal_image_url":""}],"message":"Get app configs successfully"}
     * other_a_200720-1 : {"success":true,"data":[{"id":533,"group":"video_banner","field":"leftTO","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","albums":{"id":33,"free":5,"is_vip":2,"price":0,"vip_price":0}},{"id":531,"group":"video_banner","field":"right-bottomTO","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","rank":"","promotion_group":"","status":"1","url":"ergedd://album/175","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/33472971605_1573804687717.png","albums":{"id":175,"free":5,"is_vip":2,"price":0,"vip_price":0}},{"id":532,"group":"video_banner","field":"right-topTO","min_version":"","max_version":"","position":"right-top","title":"超级飞侠","channel":"","rank":"","promotion_group":"","status":"1","url":"ergedd://album/562","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/36170542987_1573804712860.png","albums":{"id":562,"free":5,"is_vip":2,"price":0,"vip_price":0}}],"message":"Get app configs successfully"}
     */

    private BbvideoAndroidBean bbvideo_android;
    private BbvideoAndroidDebugBean bbvideo_android_debug;
    private BbvideoBannerAndroidBean bbvideo_banner_android;
    private BbvideoBannerAndroidDebugBean bbvideo_banner_android_debug;
    private ErgeddAndroidBean ergedd_android;
    private ErgeddAndroidDebugBean ergedd_android_debug;
    private ErgeddBannerAndroidBean ergedd_banner_android;
    private ErgeddBannerAndroidDebugBean ergedd_banner_android_debug;
    private BbvideoIosBean bbvideo_ios;
    private BbvideoBannerIosBean bbvideo_banner_ios;
    private ErgeddIosBean ergedd_ios;
    private OtherA2708Bean other_a_2708;
    private OtherA2726Bean other_a_2726;
    private OtherI2125Bean other_i_2125;
    private OtherI2129Bean other_i_2129;
    private OtherA2808Bean other_a_2808;
    private OtherIa2129Bean other_ia_2129;
    private OtherANewui12Bean other_a_newui12;
    private OtherA200720Bean other_a_200720;
    @SerializedName("other_a_200720-1")
    private OtherA2007201Bean other_a_2007201;
    private List<ErgeddGreetIosBean> ergedd_greet_ios;
    private List<ErgeddGreetAndroidBean> ergedd_greet_android;

    public BbvideoAndroidBean getBbvideo_android() {
        return bbvideo_android;
    }

    public void setBbvideo_android(BbvideoAndroidBean bbvideo_android) {
        this.bbvideo_android = bbvideo_android;
    }

    public BbvideoAndroidDebugBean getBbvideo_android_debug() {
        return bbvideo_android_debug;
    }

    public void setBbvideo_android_debug(BbvideoAndroidDebugBean bbvideo_android_debug) {
        this.bbvideo_android_debug = bbvideo_android_debug;
    }

    public BbvideoBannerAndroidBean getBbvideo_banner_android() {
        return bbvideo_banner_android;
    }

    public void setBbvideo_banner_android(BbvideoBannerAndroidBean bbvideo_banner_android) {
        this.bbvideo_banner_android = bbvideo_banner_android;
    }

    public BbvideoBannerAndroidDebugBean getBbvideo_banner_android_debug() {
        return bbvideo_banner_android_debug;
    }

    public void setBbvideo_banner_android_debug(BbvideoBannerAndroidDebugBean bbvideo_banner_android_debug) {
        this.bbvideo_banner_android_debug = bbvideo_banner_android_debug;
    }

    public ErgeddAndroidBean getErgedd_android() {
        return ergedd_android;
    }

    public void setErgedd_android(ErgeddAndroidBean ergedd_android) {
        this.ergedd_android = ergedd_android;
    }

    public ErgeddAndroidDebugBean getErgedd_android_debug() {
        return ergedd_android_debug;
    }

    public void setErgedd_android_debug(ErgeddAndroidDebugBean ergedd_android_debug) {
        this.ergedd_android_debug = ergedd_android_debug;
    }

    public ErgeddBannerAndroidBean getErgedd_banner_android() {
        return ergedd_banner_android;
    }

    public void setErgedd_banner_android(ErgeddBannerAndroidBean ergedd_banner_android) {
        this.ergedd_banner_android = ergedd_banner_android;
    }

    public ErgeddBannerAndroidDebugBean getErgedd_banner_android_debug() {
        return ergedd_banner_android_debug;
    }

    public void setErgedd_banner_android_debug(ErgeddBannerAndroidDebugBean ergedd_banner_android_debug) {
        this.ergedd_banner_android_debug = ergedd_banner_android_debug;
    }

    public BbvideoIosBean getBbvideo_ios() {
        return bbvideo_ios;
    }

    public void setBbvideo_ios(BbvideoIosBean bbvideo_ios) {
        this.bbvideo_ios = bbvideo_ios;
    }

    public BbvideoBannerIosBean getBbvideo_banner_ios() {
        return bbvideo_banner_ios;
    }

    public void setBbvideo_banner_ios(BbvideoBannerIosBean bbvideo_banner_ios) {
        this.bbvideo_banner_ios = bbvideo_banner_ios;
    }

    public ErgeddIosBean getErgedd_ios() {
        return ergedd_ios;
    }

    public void setErgedd_ios(ErgeddIosBean ergedd_ios) {
        this.ergedd_ios = ergedd_ios;
    }

    public OtherA2708Bean getOther_a_2708() {
        return other_a_2708;
    }

    public void setOther_a_2708(OtherA2708Bean other_a_2708) {
        this.other_a_2708 = other_a_2708;
    }

    public OtherA2726Bean getOther_a_2726() {
        return other_a_2726;
    }

    public void setOther_a_2726(OtherA2726Bean other_a_2726) {
        this.other_a_2726 = other_a_2726;
    }

    public OtherI2125Bean getOther_i_2125() {
        return other_i_2125;
    }

    public void setOther_i_2125(OtherI2125Bean other_i_2125) {
        this.other_i_2125 = other_i_2125;
    }

    public OtherI2129Bean getOther_i_2129() {
        return other_i_2129;
    }

    public void setOther_i_2129(OtherI2129Bean other_i_2129) {
        this.other_i_2129 = other_i_2129;
    }

    public OtherA2808Bean getOther_a_2808() {
        return other_a_2808;
    }

    public void setOther_a_2808(OtherA2808Bean other_a_2808) {
        this.other_a_2808 = other_a_2808;
    }

    public OtherIa2129Bean getOther_ia_2129() {
        return other_ia_2129;
    }

    public void setOther_ia_2129(OtherIa2129Bean other_ia_2129) {
        this.other_ia_2129 = other_ia_2129;
    }

    public OtherANewui12Bean getOther_a_newui12() {
        return other_a_newui12;
    }

    public void setOther_a_newui12(OtherANewui12Bean other_a_newui12) {
        this.other_a_newui12 = other_a_newui12;
    }

    public OtherA200720Bean getOther_a_200720() {
        return other_a_200720;
    }

    public void setOther_a_200720(OtherA200720Bean other_a_200720) {
        this.other_a_200720 = other_a_200720;
    }

    public OtherA2007201Bean getOther_a_2007201() {
        return other_a_2007201;
    }

    public void setOther_a_2007201(OtherA2007201Bean other_a_2007201) {
        this.other_a_2007201 = other_a_2007201;
    }

    public List<ErgeddGreetIosBean> getErgedd_greet_ios() {
        return ergedd_greet_ios;
    }

    public void setErgedd_greet_ios(List<ErgeddGreetIosBean> ergedd_greet_ios) {
        this.ergedd_greet_ios = ergedd_greet_ios;
    }

    public List<ErgeddGreetAndroidBean> getErgedd_greet_android() {
        return ergedd_greet_android;
    }

    public void setErgedd_greet_android(List<ErgeddGreetAndroidBean> ergedd_greet_android) {
        this.ergedd_greet_android = ergedd_greet_android;
    }

    public static class BbvideoAndroidBean {
        /**
         * ab_test_switch : 0
         * ab_test_data : {"ab_splash_show":"1","ab_pre_show":"0","ab_video_status":"0","ab_audio_status":"0","ab_channel":"vivo"}
         * banner2_show_switch : 1
         * banner2_not_show_rule :
         * switch_banner : 0
         * information_flow_switch : 1
         * video_title_banner_show : 0
         * audio_title_banner_show : 0
         * ad_animation : 1
         * video_complete_ad : 0
         * patch_ad_tail :
         * ad_timeout_request : 1
         * ad_source : 1
         * ad_float_show : 1
         * gdt_ad_source : 1
         * baidu_ad_source : 1
         * csj_ad_source : 1
         * reward_video_show : 1
         * unlock_ad_show : 0
         * exit_ad_show : 0
         * baidu_ad_tactics_show : 1
         * xiaomi_test : {"start_timeout":"0","start_failed_repull":"0","start_report":"1","ad_request_api":"1","ab_splash_show":"1"}
         */

        private String ab_test_switch;
        private AbTestDataBean ab_test_data;
        private String banner2_show_switch;
        private String banner2_not_show_rule;
        private String switch_banner;
        private String information_flow_switch;
        private String video_title_banner_show;
        private String audio_title_banner_show;
        private String ad_animation;
        private String video_complete_ad;
        private String patch_ad_tail;
        private String ad_timeout_request;
        private String ad_source;
        private String ad_float_show;
        private String gdt_ad_source;
        private String baidu_ad_source;
        private String csj_ad_source;
        private String reward_video_show;
        private String unlock_ad_show;
        private String exit_ad_show;
        private String baidu_ad_tactics_show;
        private XiaomiTestBean xiaomi_test;

        public String getAb_test_switch() {
            return ab_test_switch;
        }

        public void setAb_test_switch(String ab_test_switch) {
            this.ab_test_switch = ab_test_switch;
        }

        public AbTestDataBean getAb_test_data() {
            return ab_test_data;
        }

        public void setAb_test_data(AbTestDataBean ab_test_data) {
            this.ab_test_data = ab_test_data;
        }

        public String getBanner2_show_switch() {
            return banner2_show_switch;
        }

        public void setBanner2_show_switch(String banner2_show_switch) {
            this.banner2_show_switch = banner2_show_switch;
        }

        public String getBanner2_not_show_rule() {
            return banner2_not_show_rule;
        }

        public void setBanner2_not_show_rule(String banner2_not_show_rule) {
            this.banner2_not_show_rule = banner2_not_show_rule;
        }

        public String getSwitch_banner() {
            return switch_banner;
        }

        public void setSwitch_banner(String switch_banner) {
            this.switch_banner = switch_banner;
        }

        public String getInformation_flow_switch() {
            return information_flow_switch;
        }

        public void setInformation_flow_switch(String information_flow_switch) {
            this.information_flow_switch = information_flow_switch;
        }

        public String getVideo_title_banner_show() {
            return video_title_banner_show;
        }

        public void setVideo_title_banner_show(String video_title_banner_show) {
            this.video_title_banner_show = video_title_banner_show;
        }

        public String getAudio_title_banner_show() {
            return audio_title_banner_show;
        }

        public void setAudio_title_banner_show(String audio_title_banner_show) {
            this.audio_title_banner_show = audio_title_banner_show;
        }

        public String getAd_animation() {
            return ad_animation;
        }

        public void setAd_animation(String ad_animation) {
            this.ad_animation = ad_animation;
        }

        public String getVideo_complete_ad() {
            return video_complete_ad;
        }

        public void setVideo_complete_ad(String video_complete_ad) {
            this.video_complete_ad = video_complete_ad;
        }

        public String getPatch_ad_tail() {
            return patch_ad_tail;
        }

        public void setPatch_ad_tail(String patch_ad_tail) {
            this.patch_ad_tail = patch_ad_tail;
        }

        public String getAd_timeout_request() {
            return ad_timeout_request;
        }

        public void setAd_timeout_request(String ad_timeout_request) {
            this.ad_timeout_request = ad_timeout_request;
        }

        public String getAd_source() {
            return ad_source;
        }

        public void setAd_source(String ad_source) {
            this.ad_source = ad_source;
        }

        public String getAd_float_show() {
            return ad_float_show;
        }

        public void setAd_float_show(String ad_float_show) {
            this.ad_float_show = ad_float_show;
        }

        public String getGdt_ad_source() {
            return gdt_ad_source;
        }

        public void setGdt_ad_source(String gdt_ad_source) {
            this.gdt_ad_source = gdt_ad_source;
        }

        public String getBaidu_ad_source() {
            return baidu_ad_source;
        }

        public void setBaidu_ad_source(String baidu_ad_source) {
            this.baidu_ad_source = baidu_ad_source;
        }

        public String getCsj_ad_source() {
            return csj_ad_source;
        }

        public void setCsj_ad_source(String csj_ad_source) {
            this.csj_ad_source = csj_ad_source;
        }

        public String getReward_video_show() {
            return reward_video_show;
        }

        public void setReward_video_show(String reward_video_show) {
            this.reward_video_show = reward_video_show;
        }

        public String getUnlock_ad_show() {
            return unlock_ad_show;
        }

        public void setUnlock_ad_show(String unlock_ad_show) {
            this.unlock_ad_show = unlock_ad_show;
        }

        public String getExit_ad_show() {
            return exit_ad_show;
        }

        public void setExit_ad_show(String exit_ad_show) {
            this.exit_ad_show = exit_ad_show;
        }

        public String getBaidu_ad_tactics_show() {
            return baidu_ad_tactics_show;
        }

        public void setBaidu_ad_tactics_show(String baidu_ad_tactics_show) {
            this.baidu_ad_tactics_show = baidu_ad_tactics_show;
        }

        public XiaomiTestBean getXiaomi_test() {
            return xiaomi_test;
        }

        public void setXiaomi_test(XiaomiTestBean xiaomi_test) {
            this.xiaomi_test = xiaomi_test;
        }

        public static class AbTestDataBean {
            /**
             * ab_splash_show : 1
             * ab_pre_show : 0
             * ab_video_status : 0
             * ab_audio_status : 0
             * ab_channel : vivo
             */

            private String ab_splash_show;
            private String ab_pre_show;
            private String ab_video_status;
            private String ab_audio_status;
            private String ab_channel;

            public String getAb_splash_show() {
                return ab_splash_show;
            }

            public void setAb_splash_show(String ab_splash_show) {
                this.ab_splash_show = ab_splash_show;
            }

            public String getAb_pre_show() {
                return ab_pre_show;
            }

            public void setAb_pre_show(String ab_pre_show) {
                this.ab_pre_show = ab_pre_show;
            }

            public String getAb_video_status() {
                return ab_video_status;
            }

            public void setAb_video_status(String ab_video_status) {
                this.ab_video_status = ab_video_status;
            }

            public String getAb_audio_status() {
                return ab_audio_status;
            }

            public void setAb_audio_status(String ab_audio_status) {
                this.ab_audio_status = ab_audio_status;
            }

            public String getAb_channel() {
                return ab_channel;
            }

            public void setAb_channel(String ab_channel) {
                this.ab_channel = ab_channel;
            }
        }

        public static class XiaomiTestBean {
            /**
             * start_timeout : 0
             * start_failed_repull : 0
             * start_report : 1
             * ad_request_api : 1
             * ab_splash_show : 1
             */

            private String start_timeout;
            private String start_failed_repull;
            private String start_report;
            private String ad_request_api;
            private String ab_splash_show;

            public String getStart_timeout() {
                return start_timeout;
            }

            public void setStart_timeout(String start_timeout) {
                this.start_timeout = start_timeout;
            }

            public String getStart_failed_repull() {
                return start_failed_repull;
            }

            public void setStart_failed_repull(String start_failed_repull) {
                this.start_failed_repull = start_failed_repull;
            }

            public String getStart_report() {
                return start_report;
            }

            public void setStart_report(String start_report) {
                this.start_report = start_report;
            }

            public String getAd_request_api() {
                return ad_request_api;
            }

            public void setAd_request_api(String ad_request_api) {
                this.ad_request_api = ad_request_api;
            }

            public String getAb_splash_show() {
                return ab_splash_show;
            }

            public void setAb_splash_show(String ab_splash_show) {
                this.ab_splash_show = ab_splash_show;
            }
        }
    }

    public static class BbvideoAndroidDebugBean {
        /**
         * ab_test_switch : 0
         * ab_test_data : {"ab_splash_show":"1","ab_pre_show":"0","ab_video_status":"0","ab_audio_status":"0","ab_channel":"vivo"}
         * banner2_show_switch : 1
         * banner2_not_show_rule :
         * switch_banner : 1
         * information_flow_switch : 1
         * video_title_banner_show : 0
         * audio_title_banner_show : 0
         * ad_animation : 1
         * video_complete_ad : 0
         * patch_ad_tail : 0,1,2,3,4,5,6,7,8,9
         * ad_timeout_request : 1
         * ad_source : 1
         * ad_float_show : 0
         * gdt_ad_source : 1
         * baidu_ad_source : 1
         * csj_ad_source : 1
         * reward_video_show : 1
         * unlock_ad_show : 1
         * exit_ad_show : 1
         * baidu_ad_tactics_show : 1
         * xiaomi_test : {"start_timeout":"0","start_failed_repull":"0","start_report":"1","ad_request_api":"1","ab_splash_show":"1"}
         */

        private String ab_test_switch;
        private AbTestDataBeanX ab_test_data;
        private String banner2_show_switch;
        private String banner2_not_show_rule;
        private String switch_banner;
        private String information_flow_switch;
        private String video_title_banner_show;
        private String audio_title_banner_show;
        private String ad_animation;
        private String video_complete_ad;
        private String patch_ad_tail;
        private String ad_timeout_request;
        private String ad_source;
        private String ad_float_show;
        private String gdt_ad_source;
        private String baidu_ad_source;
        private String csj_ad_source;
        private String reward_video_show;
        private String unlock_ad_show;
        private String exit_ad_show;
        private String baidu_ad_tactics_show;
        private XiaomiTestBeanX xiaomi_test;

        public String getAb_test_switch() {
            return ab_test_switch;
        }

        public void setAb_test_switch(String ab_test_switch) {
            this.ab_test_switch = ab_test_switch;
        }

        public AbTestDataBeanX getAb_test_data() {
            return ab_test_data;
        }

        public void setAb_test_data(AbTestDataBeanX ab_test_data) {
            this.ab_test_data = ab_test_data;
        }

        public String getBanner2_show_switch() {
            return banner2_show_switch;
        }

        public void setBanner2_show_switch(String banner2_show_switch) {
            this.banner2_show_switch = banner2_show_switch;
        }

        public String getBanner2_not_show_rule() {
            return banner2_not_show_rule;
        }

        public void setBanner2_not_show_rule(String banner2_not_show_rule) {
            this.banner2_not_show_rule = banner2_not_show_rule;
        }

        public String getSwitch_banner() {
            return switch_banner;
        }

        public void setSwitch_banner(String switch_banner) {
            this.switch_banner = switch_banner;
        }

        public String getInformation_flow_switch() {
            return information_flow_switch;
        }

        public void setInformation_flow_switch(String information_flow_switch) {
            this.information_flow_switch = information_flow_switch;
        }

        public String getVideo_title_banner_show() {
            return video_title_banner_show;
        }

        public void setVideo_title_banner_show(String video_title_banner_show) {
            this.video_title_banner_show = video_title_banner_show;
        }

        public String getAudio_title_banner_show() {
            return audio_title_banner_show;
        }

        public void setAudio_title_banner_show(String audio_title_banner_show) {
            this.audio_title_banner_show = audio_title_banner_show;
        }

        public String getAd_animation() {
            return ad_animation;
        }

        public void setAd_animation(String ad_animation) {
            this.ad_animation = ad_animation;
        }

        public String getVideo_complete_ad() {
            return video_complete_ad;
        }

        public void setVideo_complete_ad(String video_complete_ad) {
            this.video_complete_ad = video_complete_ad;
        }

        public String getPatch_ad_tail() {
            return patch_ad_tail;
        }

        public void setPatch_ad_tail(String patch_ad_tail) {
            this.patch_ad_tail = patch_ad_tail;
        }

        public String getAd_timeout_request() {
            return ad_timeout_request;
        }

        public void setAd_timeout_request(String ad_timeout_request) {
            this.ad_timeout_request = ad_timeout_request;
        }

        public String getAd_source() {
            return ad_source;
        }

        public void setAd_source(String ad_source) {
            this.ad_source = ad_source;
        }

        public String getAd_float_show() {
            return ad_float_show;
        }

        public void setAd_float_show(String ad_float_show) {
            this.ad_float_show = ad_float_show;
        }

        public String getGdt_ad_source() {
            return gdt_ad_source;
        }

        public void setGdt_ad_source(String gdt_ad_source) {
            this.gdt_ad_source = gdt_ad_source;
        }

        public String getBaidu_ad_source() {
            return baidu_ad_source;
        }

        public void setBaidu_ad_source(String baidu_ad_source) {
            this.baidu_ad_source = baidu_ad_source;
        }

        public String getCsj_ad_source() {
            return csj_ad_source;
        }

        public void setCsj_ad_source(String csj_ad_source) {
            this.csj_ad_source = csj_ad_source;
        }

        public String getReward_video_show() {
            return reward_video_show;
        }

        public void setReward_video_show(String reward_video_show) {
            this.reward_video_show = reward_video_show;
        }

        public String getUnlock_ad_show() {
            return unlock_ad_show;
        }

        public void setUnlock_ad_show(String unlock_ad_show) {
            this.unlock_ad_show = unlock_ad_show;
        }

        public String getExit_ad_show() {
            return exit_ad_show;
        }

        public void setExit_ad_show(String exit_ad_show) {
            this.exit_ad_show = exit_ad_show;
        }

        public String getBaidu_ad_tactics_show() {
            return baidu_ad_tactics_show;
        }

        public void setBaidu_ad_tactics_show(String baidu_ad_tactics_show) {
            this.baidu_ad_tactics_show = baidu_ad_tactics_show;
        }

        public XiaomiTestBeanX getXiaomi_test() {
            return xiaomi_test;
        }

        public void setXiaomi_test(XiaomiTestBeanX xiaomi_test) {
            this.xiaomi_test = xiaomi_test;
        }

        public static class AbTestDataBeanX {
            /**
             * ab_splash_show : 1
             * ab_pre_show : 0
             * ab_video_status : 0
             * ab_audio_status : 0
             * ab_channel : vivo
             */

            private String ab_splash_show;
            private String ab_pre_show;
            private String ab_video_status;
            private String ab_audio_status;
            private String ab_channel;

            public String getAb_splash_show() {
                return ab_splash_show;
            }

            public void setAb_splash_show(String ab_splash_show) {
                this.ab_splash_show = ab_splash_show;
            }

            public String getAb_pre_show() {
                return ab_pre_show;
            }

            public void setAb_pre_show(String ab_pre_show) {
                this.ab_pre_show = ab_pre_show;
            }

            public String getAb_video_status() {
                return ab_video_status;
            }

            public void setAb_video_status(String ab_video_status) {
                this.ab_video_status = ab_video_status;
            }

            public String getAb_audio_status() {
                return ab_audio_status;
            }

            public void setAb_audio_status(String ab_audio_status) {
                this.ab_audio_status = ab_audio_status;
            }

            public String getAb_channel() {
                return ab_channel;
            }

            public void setAb_channel(String ab_channel) {
                this.ab_channel = ab_channel;
            }
        }

        public static class XiaomiTestBeanX {
            /**
             * start_timeout : 0
             * start_failed_repull : 0
             * start_report : 1
             * ad_request_api : 1
             * ab_splash_show : 1
             */

            private String start_timeout;
            private String start_failed_repull;
            private String start_report;
            private String ad_request_api;
            private String ab_splash_show;

            public String getStart_timeout() {
                return start_timeout;
            }

            public void setStart_timeout(String start_timeout) {
                this.start_timeout = start_timeout;
            }

            public String getStart_failed_repull() {
                return start_failed_repull;
            }

            public void setStart_failed_repull(String start_failed_repull) {
                this.start_failed_repull = start_failed_repull;
            }

            public String getStart_report() {
                return start_report;
            }

            public void setStart_report(String start_report) {
                this.start_report = start_report;
            }

            public String getAd_request_api() {
                return ad_request_api;
            }

            public void setAd_request_api(String ad_request_api) {
                this.ad_request_api = ad_request_api;
            }

            public String getAb_splash_show() {
                return ab_splash_show;
            }

            public void setAb_splash_show(String ab_splash_show) {
                this.ab_splash_show = ab_splash_show;
            }
        }
    }

    public static class BbvideoBannerAndroidBean {
        private List<?> video_data;

        public List<?> getVideo_data() {
            return video_data;
        }

        public void setVideo_data(List<?> video_data) {
            this.video_data = video_data;
        }
    }

    public static class BbvideoBannerAndroidDebugBean {
        /**
         * album_data :
         * video_data :
         */

        private String album_data;
        private String video_data;

        public String getAlbum_data() {
            return album_data;
        }

        public void setAlbum_data(String album_data) {
            this.album_data = album_data;
        }

        public String getVideo_data() {
            return video_data;
        }

        public void setVideo_data(String video_data) {
            this.video_data = video_data;
        }
    }

    public static class ErgeddAndroidBean {
        /**
         * banner2_show : 1
         * banner2_not_show :
         * switch_ad : 0
         * information_flow_switch : 0
         * ad_animation : 1
         * video_complete_ad : 0
         * patch_ad_tail : 3,6,9
         * ad_timeout_request : 1
         * ad_source : 1
         * ad_float_show : 0
         * gdt_ad_source : 1
         * baidu_ad_source : 1
         * csj_ad_source : 1
         * reward_video_show : 1
         * unlock_ad_show : 0
         * exit_ad_show : 1
         * baidu_ad_tactics_show : 1
         * temp_custom_ad_show : 0
         * temp_custom_ad_limit : 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
         * ad_api_source : v1
         * is_new_ad_api : 1
         * xiaomi_test : {"start_timeout":"0","start_failed_repull":"0","start_report":"1","ad_request_api":"1","ab_splash_show":"0"}
         */

        private String banner2_show;
        private String banner2_not_show;
        private String switch_ad;
        private String information_flow_switch;
        private String ad_animation;
        private String video_complete_ad;
        private String patch_ad_tail;
        private String ad_timeout_request;
        private String ad_source;
        private String ad_float_show;
        private String gdt_ad_source;
        private String baidu_ad_source;
        private String csj_ad_source;
        private String reward_video_show;
        private String unlock_ad_show;
        private String exit_ad_show;
        private String baidu_ad_tactics_show;
        private String temp_custom_ad_show;
        private String temp_custom_ad_limit;
        private String ad_api_source;
        private String is_new_ad_api;
        private XiaomiTestBeanXX xiaomi_test;

        public String getBanner2_show() {
            return banner2_show;
        }

        public void setBanner2_show(String banner2_show) {
            this.banner2_show = banner2_show;
        }

        public String getBanner2_not_show() {
            return banner2_not_show;
        }

        public void setBanner2_not_show(String banner2_not_show) {
            this.banner2_not_show = banner2_not_show;
        }

        public String getSwitch_ad() {
            return switch_ad;
        }

        public void setSwitch_ad(String switch_ad) {
            this.switch_ad = switch_ad;
        }

        public String getInformation_flow_switch() {
            return information_flow_switch;
        }

        public void setInformation_flow_switch(String information_flow_switch) {
            this.information_flow_switch = information_flow_switch;
        }

        public String getAd_animation() {
            return ad_animation;
        }

        public void setAd_animation(String ad_animation) {
            this.ad_animation = ad_animation;
        }

        public String getVideo_complete_ad() {
            return video_complete_ad;
        }

        public void setVideo_complete_ad(String video_complete_ad) {
            this.video_complete_ad = video_complete_ad;
        }

        public String getPatch_ad_tail() {
            return patch_ad_tail;
        }

        public void setPatch_ad_tail(String patch_ad_tail) {
            this.patch_ad_tail = patch_ad_tail;
        }

        public String getAd_timeout_request() {
            return ad_timeout_request;
        }

        public void setAd_timeout_request(String ad_timeout_request) {
            this.ad_timeout_request = ad_timeout_request;
        }

        public String getAd_source() {
            return ad_source;
        }

        public void setAd_source(String ad_source) {
            this.ad_source = ad_source;
        }

        public String getAd_float_show() {
            return ad_float_show;
        }

        public void setAd_float_show(String ad_float_show) {
            this.ad_float_show = ad_float_show;
        }

        public String getGdt_ad_source() {
            return gdt_ad_source;
        }

        public void setGdt_ad_source(String gdt_ad_source) {
            this.gdt_ad_source = gdt_ad_source;
        }

        public String getBaidu_ad_source() {
            return baidu_ad_source;
        }

        public void setBaidu_ad_source(String baidu_ad_source) {
            this.baidu_ad_source = baidu_ad_source;
        }

        public String getCsj_ad_source() {
            return csj_ad_source;
        }

        public void setCsj_ad_source(String csj_ad_source) {
            this.csj_ad_source = csj_ad_source;
        }

        public String getReward_video_show() {
            return reward_video_show;
        }

        public void setReward_video_show(String reward_video_show) {
            this.reward_video_show = reward_video_show;
        }

        public String getUnlock_ad_show() {
            return unlock_ad_show;
        }

        public void setUnlock_ad_show(String unlock_ad_show) {
            this.unlock_ad_show = unlock_ad_show;
        }

        public String getExit_ad_show() {
            return exit_ad_show;
        }

        public void setExit_ad_show(String exit_ad_show) {
            this.exit_ad_show = exit_ad_show;
        }

        public String getBaidu_ad_tactics_show() {
            return baidu_ad_tactics_show;
        }

        public void setBaidu_ad_tactics_show(String baidu_ad_tactics_show) {
            this.baidu_ad_tactics_show = baidu_ad_tactics_show;
        }

        public String getTemp_custom_ad_show() {
            return temp_custom_ad_show;
        }

        public void setTemp_custom_ad_show(String temp_custom_ad_show) {
            this.temp_custom_ad_show = temp_custom_ad_show;
        }

        public String getTemp_custom_ad_limit() {
            return temp_custom_ad_limit;
        }

        public void setTemp_custom_ad_limit(String temp_custom_ad_limit) {
            this.temp_custom_ad_limit = temp_custom_ad_limit;
        }

        public String getAd_api_source() {
            return ad_api_source;
        }

        public void setAd_api_source(String ad_api_source) {
            this.ad_api_source = ad_api_source;
        }

        public String getIs_new_ad_api() {
            return is_new_ad_api;
        }

        public void setIs_new_ad_api(String is_new_ad_api) {
            this.is_new_ad_api = is_new_ad_api;
        }

        public XiaomiTestBeanXX getXiaomi_test() {
            return xiaomi_test;
        }

        public void setXiaomi_test(XiaomiTestBeanXX xiaomi_test) {
            this.xiaomi_test = xiaomi_test;
        }

        public static class XiaomiTestBeanXX {
            /**
             * start_timeout : 0
             * start_failed_repull : 0
             * start_report : 1
             * ad_request_api : 1
             * ab_splash_show : 0
             */

            private String start_timeout;
            private String start_failed_repull;
            private String start_report;
            private String ad_request_api;
            private String ab_splash_show;

            public String getStart_timeout() {
                return start_timeout;
            }

            public void setStart_timeout(String start_timeout) {
                this.start_timeout = start_timeout;
            }

            public String getStart_failed_repull() {
                return start_failed_repull;
            }

            public void setStart_failed_repull(String start_failed_repull) {
                this.start_failed_repull = start_failed_repull;
            }

            public String getStart_report() {
                return start_report;
            }

            public void setStart_report(String start_report) {
                this.start_report = start_report;
            }

            public String getAd_request_api() {
                return ad_request_api;
            }

            public void setAd_request_api(String ad_request_api) {
                this.ad_request_api = ad_request_api;
            }

            public String getAb_splash_show() {
                return ab_splash_show;
            }

            public void setAb_splash_show(String ab_splash_show) {
                this.ab_splash_show = ab_splash_show;
            }
        }
    }

    public static class ErgeddAndroidDebugBean {
        /**
         * banner2_show : 1
         * banner2_not_show :
         * switch_ad : 0
         * information_flow_switch : 0
         * ad_animation : 1
         * video_complete_ad : 0
         * patch_ad_tail : 3,6,9
         * ad_timeout_request : 1
         * ad_source : 1
         * ad_float_show : 0
         * gdt_ad_source : 1
         * baidu_ad_source : 1
         * csj_ad_source : 1
         * reward_video_show : 1
         * unlock_ad_show : 1
         * exit_ad_show : 1
         * baidu_ad_tactics_show : 1
         * temp_custom_ad_show : 1
         * temp_custom_ad_limit : 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
         * ad_api_source : v1
         * is_new_ad_api : 1
         * xiaomi_test : {"start_timeout":"1","start_failed_repull":"1","start_report":"1","ad_request_api":"1","ab_splash_show":"0"}
         */

        private String banner2_show;
        private String banner2_not_show;
        private String switch_ad;
        private String information_flow_switch;
        private String ad_animation;
        private String video_complete_ad;
        private String patch_ad_tail;
        private String ad_timeout_request;
        private String ad_source;
        private String ad_float_show;
        private String gdt_ad_source;
        private String baidu_ad_source;
        private String csj_ad_source;
        private String reward_video_show;
        private String unlock_ad_show;
        private String exit_ad_show;
        private String baidu_ad_tactics_show;
        private String temp_custom_ad_show;
        private String temp_custom_ad_limit;
        private String ad_api_source;
        private String is_new_ad_api;
        private XiaomiTestBeanXXX xiaomi_test;

        public String getBanner2_show() {
            return banner2_show;
        }

        public void setBanner2_show(String banner2_show) {
            this.banner2_show = banner2_show;
        }

        public String getBanner2_not_show() {
            return banner2_not_show;
        }

        public void setBanner2_not_show(String banner2_not_show) {
            this.banner2_not_show = banner2_not_show;
        }

        public String getSwitch_ad() {
            return switch_ad;
        }

        public void setSwitch_ad(String switch_ad) {
            this.switch_ad = switch_ad;
        }

        public String getInformation_flow_switch() {
            return information_flow_switch;
        }

        public void setInformation_flow_switch(String information_flow_switch) {
            this.information_flow_switch = information_flow_switch;
        }

        public String getAd_animation() {
            return ad_animation;
        }

        public void setAd_animation(String ad_animation) {
            this.ad_animation = ad_animation;
        }

        public String getVideo_complete_ad() {
            return video_complete_ad;
        }

        public void setVideo_complete_ad(String video_complete_ad) {
            this.video_complete_ad = video_complete_ad;
        }

        public String getPatch_ad_tail() {
            return patch_ad_tail;
        }

        public void setPatch_ad_tail(String patch_ad_tail) {
            this.patch_ad_tail = patch_ad_tail;
        }

        public String getAd_timeout_request() {
            return ad_timeout_request;
        }

        public void setAd_timeout_request(String ad_timeout_request) {
            this.ad_timeout_request = ad_timeout_request;
        }

        public String getAd_source() {
            return ad_source;
        }

        public void setAd_source(String ad_source) {
            this.ad_source = ad_source;
        }

        public String getAd_float_show() {
            return ad_float_show;
        }

        public void setAd_float_show(String ad_float_show) {
            this.ad_float_show = ad_float_show;
        }

        public String getGdt_ad_source() {
            return gdt_ad_source;
        }

        public void setGdt_ad_source(String gdt_ad_source) {
            this.gdt_ad_source = gdt_ad_source;
        }

        public String getBaidu_ad_source() {
            return baidu_ad_source;
        }

        public void setBaidu_ad_source(String baidu_ad_source) {
            this.baidu_ad_source = baidu_ad_source;
        }

        public String getCsj_ad_source() {
            return csj_ad_source;
        }

        public void setCsj_ad_source(String csj_ad_source) {
            this.csj_ad_source = csj_ad_source;
        }

        public String getReward_video_show() {
            return reward_video_show;
        }

        public void setReward_video_show(String reward_video_show) {
            this.reward_video_show = reward_video_show;
        }

        public String getUnlock_ad_show() {
            return unlock_ad_show;
        }

        public void setUnlock_ad_show(String unlock_ad_show) {
            this.unlock_ad_show = unlock_ad_show;
        }

        public String getExit_ad_show() {
            return exit_ad_show;
        }

        public void setExit_ad_show(String exit_ad_show) {
            this.exit_ad_show = exit_ad_show;
        }

        public String getBaidu_ad_tactics_show() {
            return baidu_ad_tactics_show;
        }

        public void setBaidu_ad_tactics_show(String baidu_ad_tactics_show) {
            this.baidu_ad_tactics_show = baidu_ad_tactics_show;
        }

        public String getTemp_custom_ad_show() {
            return temp_custom_ad_show;
        }

        public void setTemp_custom_ad_show(String temp_custom_ad_show) {
            this.temp_custom_ad_show = temp_custom_ad_show;
        }

        public String getTemp_custom_ad_limit() {
            return temp_custom_ad_limit;
        }

        public void setTemp_custom_ad_limit(String temp_custom_ad_limit) {
            this.temp_custom_ad_limit = temp_custom_ad_limit;
        }

        public String getAd_api_source() {
            return ad_api_source;
        }

        public void setAd_api_source(String ad_api_source) {
            this.ad_api_source = ad_api_source;
        }

        public String getIs_new_ad_api() {
            return is_new_ad_api;
        }

        public void setIs_new_ad_api(String is_new_ad_api) {
            this.is_new_ad_api = is_new_ad_api;
        }

        public XiaomiTestBeanXXX getXiaomi_test() {
            return xiaomi_test;
        }

        public void setXiaomi_test(XiaomiTestBeanXXX xiaomi_test) {
            this.xiaomi_test = xiaomi_test;
        }

        public static class XiaomiTestBeanXXX {
            /**
             * start_timeout : 1
             * start_failed_repull : 1
             * start_report : 1
             * ad_request_api : 1
             * ab_splash_show : 0
             */

            private String start_timeout;
            private String start_failed_repull;
            private String start_report;
            private String ad_request_api;
            private String ab_splash_show;

            public String getStart_timeout() {
                return start_timeout;
            }

            public void setStart_timeout(String start_timeout) {
                this.start_timeout = start_timeout;
            }

            public String getStart_failed_repull() {
                return start_failed_repull;
            }

            public void setStart_failed_repull(String start_failed_repull) {
                this.start_failed_repull = start_failed_repull;
            }

            public String getStart_report() {
                return start_report;
            }

            public void setStart_report(String start_report) {
                this.start_report = start_report;
            }

            public String getAd_request_api() {
                return ad_request_api;
            }

            public void setAd_request_api(String ad_request_api) {
                this.ad_request_api = ad_request_api;
            }

            public String getAb_splash_show() {
                return ab_splash_show;
            }

            public void setAb_splash_show(String ab_splash_show) {
                this.ab_splash_show = ab_splash_show;
            }
        }
    }

    public static class ErgeddBannerAndroidBean {
        private List<?> album_data;
        private List<?> video_data;

        public List<?> getAlbum_data() {
            return album_data;
        }

        public void setAlbum_data(List<?> album_data) {
            this.album_data = album_data;
        }

        public List<?> getVideo_data() {
            return video_data;
        }

        public void setVideo_data(List<?> video_data) {
            this.video_data = video_data;
        }
    }

    public static class ErgeddBannerAndroidDebugBean {
        private List<?> album_data;
        private List<?> video_data;

        public List<?> getAlbum_data() {
            return album_data;
        }

        public void setAlbum_data(List<?> album_data) {
            this.album_data = album_data;
        }

        public List<?> getVideo_data() {
            return video_data;
        }

        public void setVideo_data(List<?> video_data) {
            this.video_data = video_data;
        }
    }

    public static class BbvideoIosBean {
        /**
         * splash_show : 0
         * infoflow_show : 1
         * tt_banner_show : 1
         * small_banner_show : 1
         * ad_num : 1
         * free_dur : 20
         * useNewBannerAdType : 1
         * homeStopRetry : 0
         * ad_float_show : 1
         */

        private String splash_show;
        private String infoflow_show;
        private String tt_banner_show;
        private String small_banner_show;
        private String ad_num;
        private String free_dur;
        private String useNewBannerAdType;
        private String homeStopRetry;
        private String ad_float_show;

        public String getSplash_show() {
            return splash_show;
        }

        public void setSplash_show(String splash_show) {
            this.splash_show = splash_show;
        }

        public String getInfoflow_show() {
            return infoflow_show;
        }

        public void setInfoflow_show(String infoflow_show) {
            this.infoflow_show = infoflow_show;
        }

        public String getTt_banner_show() {
            return tt_banner_show;
        }

        public void setTt_banner_show(String tt_banner_show) {
            this.tt_banner_show = tt_banner_show;
        }

        public String getSmall_banner_show() {
            return small_banner_show;
        }

        public void setSmall_banner_show(String small_banner_show) {
            this.small_banner_show = small_banner_show;
        }

        public String getAd_num() {
            return ad_num;
        }

        public void setAd_num(String ad_num) {
            this.ad_num = ad_num;
        }

        public String getFree_dur() {
            return free_dur;
        }

        public void setFree_dur(String free_dur) {
            this.free_dur = free_dur;
        }

        public String getUseNewBannerAdType() {
            return useNewBannerAdType;
        }

        public void setUseNewBannerAdType(String useNewBannerAdType) {
            this.useNewBannerAdType = useNewBannerAdType;
        }

        public String getHomeStopRetry() {
            return homeStopRetry;
        }

        public void setHomeStopRetry(String homeStopRetry) {
            this.homeStopRetry = homeStopRetry;
        }

        public String getAd_float_show() {
            return ad_float_show;
        }

        public void setAd_float_show(String ad_float_show) {
            this.ad_float_show = ad_float_show;
        }
    }

    public static class BbvideoBannerIosBean {
        private List<AlbumDataBean> album_data;
        private List<VideoDataBean> video_data;

        public List<AlbumDataBean> getAlbum_data() {
            return album_data;
        }

        public void setAlbum_data(List<AlbumDataBean> album_data) {
            this.album_data = album_data;
        }

        public List<VideoDataBean> getVideo_data() {
            return video_data;
        }

        public void setVideo_data(List<VideoDataBean> video_data) {
            this.video_data = video_data;
        }

        public static class AlbumDataBean {
            /**
             * album_name : 经典中文儿歌
             * album_id : ["2"]
             * baidu_appsid : b654441f
             * baidu_bannerid : 6064632
             * baidu1_appsid : b654441f
             * baidu1_bannerid : 6064633
             */

            private String album_name;
            private String baidu_appsid;
            private String baidu_bannerid;
            private String baidu1_appsid;
            private String baidu1_bannerid;
            private List<String> album_id;

            public String getAlbum_name() {
                return album_name;
            }

            public void setAlbum_name(String album_name) {
                this.album_name = album_name;
            }

            public String getBaidu_appsid() {
                return baidu_appsid;
            }

            public void setBaidu_appsid(String baidu_appsid) {
                this.baidu_appsid = baidu_appsid;
            }

            public String getBaidu_bannerid() {
                return baidu_bannerid;
            }

            public void setBaidu_bannerid(String baidu_bannerid) {
                this.baidu_bannerid = baidu_bannerid;
            }

            public String getBaidu1_appsid() {
                return baidu1_appsid;
            }

            public void setBaidu1_appsid(String baidu1_appsid) {
                this.baidu1_appsid = baidu1_appsid;
            }

            public String getBaidu1_bannerid() {
                return baidu1_bannerid;
            }

            public void setBaidu1_bannerid(String baidu1_bannerid) {
                this.baidu1_bannerid = baidu1_bannerid;
            }

            public List<String> getAlbum_id() {
                return album_id;
            }

            public void setAlbum_id(List<String> album_id) {
                this.album_id = album_id;
            }
        }

        public static class VideoDataBean {
            /**
             * video_name : 小猪佩奇3
             * video_id : ["9941","9942","9943","9944","9945","9946","9947","9948","9949","9950","9951","9952","9953","9954","9955","9956","9957","9958","9959","9960","17111","9961","9962","9963","9964","9965","5880","5881","5882","5883","5884","5885","5886","5887","5888","5889","5890","5891","5892"]
             * baidu_appsid : b654441f
             * baidu_bannerid : 6064628
             * baidu1_appsid : b654441f
             * baidu1_bannerid : 6064631
             */

            private String video_name;
            private String baidu_appsid;
            private String baidu_bannerid;
            private String baidu1_appsid;
            private String baidu1_bannerid;
            private List<String> video_id;

            public String getVideo_name() {
                return video_name;
            }

            public void setVideo_name(String video_name) {
                this.video_name = video_name;
            }

            public String getBaidu_appsid() {
                return baidu_appsid;
            }

            public void setBaidu_appsid(String baidu_appsid) {
                this.baidu_appsid = baidu_appsid;
            }

            public String getBaidu_bannerid() {
                return baidu_bannerid;
            }

            public void setBaidu_bannerid(String baidu_bannerid) {
                this.baidu_bannerid = baidu_bannerid;
            }

            public String getBaidu1_appsid() {
                return baidu1_appsid;
            }

            public void setBaidu1_appsid(String baidu1_appsid) {
                this.baidu1_appsid = baidu1_appsid;
            }

            public String getBaidu1_bannerid() {
                return baidu1_bannerid;
            }

            public void setBaidu1_bannerid(String baidu1_bannerid) {
                this.baidu1_bannerid = baidu1_bannerid;
            }

            public List<String> getVideo_id() {
                return video_id;
            }

            public void setVideo_id(List<String> video_id) {
                this.video_id = video_id;
            }
        }
    }

    public static class ErgeddIosBean {
        /**
         * infoflow_show_ergedd : 0
         * small_banner_show_ergedd : 1
         * ad_num : 1
         * free_dur : 20
         * useNewBannerAdType_ergedd : 0
         * homeStopRetry_ergedd : 0
         * ad_float_show_ergedd : 1
         * ad_float_compute_show_ergedd : 1
         * video_complete_ad : 1
         * patch_ad_tail : 3,6,9
         * PlacementId_banner1 :
         * PlacementId_banner3 :
         * useNewBannerAdType_ergedd_v2 : 1
         * show_BaiDu_55_ergedd : 1
         * useNewBannerAdType_ergedd_v3 : 1
         * isBUser_QMB_2_Close : 0
         * isBUser_QMB_iPad_Close : 0
         */

        private String infoflow_show_ergedd;
        private String small_banner_show_ergedd;
        private String ad_num;
        private String free_dur;
        private String useNewBannerAdType_ergedd;
        private String homeStopRetry_ergedd;
        private String ad_float_show_ergedd;
        private String ad_float_compute_show_ergedd;
        private String video_complete_ad;
        private String patch_ad_tail;
        private String PlacementId_banner1;
        private String PlacementId_banner3;
        private String useNewBannerAdType_ergedd_v2;
        private String show_BaiDu_55_ergedd;
        private String useNewBannerAdType_ergedd_v3;
        private String isBUser_QMB_2_Close;
        private String isBUser_QMB_iPad_Close;

        public String getInfoflow_show_ergedd() {
            return infoflow_show_ergedd;
        }

        public void setInfoflow_show_ergedd(String infoflow_show_ergedd) {
            this.infoflow_show_ergedd = infoflow_show_ergedd;
        }

        public String getSmall_banner_show_ergedd() {
            return small_banner_show_ergedd;
        }

        public void setSmall_banner_show_ergedd(String small_banner_show_ergedd) {
            this.small_banner_show_ergedd = small_banner_show_ergedd;
        }

        public String getAd_num() {
            return ad_num;
        }

        public void setAd_num(String ad_num) {
            this.ad_num = ad_num;
        }

        public String getFree_dur() {
            return free_dur;
        }

        public void setFree_dur(String free_dur) {
            this.free_dur = free_dur;
        }

        public String getUseNewBannerAdType_ergedd() {
            return useNewBannerAdType_ergedd;
        }

        public void setUseNewBannerAdType_ergedd(String useNewBannerAdType_ergedd) {
            this.useNewBannerAdType_ergedd = useNewBannerAdType_ergedd;
        }

        public String getHomeStopRetry_ergedd() {
            return homeStopRetry_ergedd;
        }

        public void setHomeStopRetry_ergedd(String homeStopRetry_ergedd) {
            this.homeStopRetry_ergedd = homeStopRetry_ergedd;
        }

        public String getAd_float_show_ergedd() {
            return ad_float_show_ergedd;
        }

        public void setAd_float_show_ergedd(String ad_float_show_ergedd) {
            this.ad_float_show_ergedd = ad_float_show_ergedd;
        }

        public String getAd_float_compute_show_ergedd() {
            return ad_float_compute_show_ergedd;
        }

        public void setAd_float_compute_show_ergedd(String ad_float_compute_show_ergedd) {
            this.ad_float_compute_show_ergedd = ad_float_compute_show_ergedd;
        }

        public String getVideo_complete_ad() {
            return video_complete_ad;
        }

        public void setVideo_complete_ad(String video_complete_ad) {
            this.video_complete_ad = video_complete_ad;
        }

        public String getPatch_ad_tail() {
            return patch_ad_tail;
        }

        public void setPatch_ad_tail(String patch_ad_tail) {
            this.patch_ad_tail = patch_ad_tail;
        }

        public String getPlacementId_banner1() {
            return PlacementId_banner1;
        }

        public void setPlacementId_banner1(String PlacementId_banner1) {
            this.PlacementId_banner1 = PlacementId_banner1;
        }

        public String getPlacementId_banner3() {
            return PlacementId_banner3;
        }

        public void setPlacementId_banner3(String PlacementId_banner3) {
            this.PlacementId_banner3 = PlacementId_banner3;
        }

        public String getUseNewBannerAdType_ergedd_v2() {
            return useNewBannerAdType_ergedd_v2;
        }

        public void setUseNewBannerAdType_ergedd_v2(String useNewBannerAdType_ergedd_v2) {
            this.useNewBannerAdType_ergedd_v2 = useNewBannerAdType_ergedd_v2;
        }

        public String getShow_BaiDu_55_ergedd() {
            return show_BaiDu_55_ergedd;
        }

        public void setShow_BaiDu_55_ergedd(String show_BaiDu_55_ergedd) {
            this.show_BaiDu_55_ergedd = show_BaiDu_55_ergedd;
        }

        public String getUseNewBannerAdType_ergedd_v3() {
            return useNewBannerAdType_ergedd_v3;
        }

        public void setUseNewBannerAdType_ergedd_v3(String useNewBannerAdType_ergedd_v3) {
            this.useNewBannerAdType_ergedd_v3 = useNewBannerAdType_ergedd_v3;
        }

        public String getIsBUser_QMB_2_Close() {
            return isBUser_QMB_2_Close;
        }

        public void setIsBUser_QMB_2_Close(String isBUser_QMB_2_Close) {
            this.isBUser_QMB_2_Close = isBUser_QMB_2_Close;
        }

        public String getIsBUser_QMB_iPad_Close() {
            return isBUser_QMB_iPad_Close;
        }

        public void setIsBUser_QMB_iPad_Close(String isBUser_QMB_iPad_Close) {
            this.isBUser_QMB_iPad_Close = isBUser_QMB_iPad_Close;
        }
    }

    public static class OtherA2708Bean {
        /**
         * success : true
         * data : [{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/60195551261_1563877245671.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"萌鸡小队","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/532","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/96534051122_1563877303611.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"status":"1","url":"ergedd://album/175","image_url":"http://img5g22.ergedd.com/admin/promotion/66208774742_1563877324077.png","short_image_url":"","horizontal_image_url":""}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBean> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 16
             * group : promotion_banner
             * field : left
             * min_version :
             * max_version :
             * position : left
             * title : 小猪佩奇
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * bundle_id : com.mampod.ergedd
             * image_url : http://img5g22.ergedd.com/admin/promotion/60195551261_1563877245671.png
             * short_image_url :
             * horizontal_image_url :
             * diy_ad_proportion : 0
             * third_ad_proportion : 10:0
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String bundle_id;
            private String image_url;
            private String short_image_url;
            private String horizontal_image_url;
            private String diy_ad_proportion;
            private String third_ad_proportion;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }

            public String getDiy_ad_proportion() {
                return diy_ad_proportion;
            }

            public void setDiy_ad_proportion(String diy_ad_proportion) {
                this.diy_ad_proportion = diy_ad_proportion;
            }

            public String getThird_ad_proportion() {
                return third_ad_proportion;
            }

            public void setThird_ad_proportion(String third_ad_proportion) {
                this.third_ad_proportion = third_ad_proportion;
            }
        }
    }

    public static class OtherA2726Bean {
        /**
         * success : true
         * data : [{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/60661304257_1569224434323.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"萌鸡小队","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/532","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/70224414740_1569224480488.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"status":"1","url":"ergedd://album/175","image_url":"http://img5g22.ergedd.com/admin/promotion/55116124360_1569224503190.png","short_image_url":"","horizontal_image_url":""},{"id":19,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"小马宝莉","channel":"","grade":0,"status":"1","url":"ergedd://album/233","image_url":"http://img5g22.ergedd.com/admin/promotion/1101992266_1569224560511.png","short_image_url":"","horizontal_image_url":""}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanX> getData() {
            return data;
        }

        public void setData(List<DataBeanX> data) {
            this.data = data;
        }

        public static class DataBeanX {
            /**
             * id : 16
             * group : promotion_banner
             * field : left
             * min_version :
             * max_version :
             * position : left
             * title : 小猪佩奇
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * bundle_id : com.mampod.ergedd
             * image_url : http://img5g22.ergedd.com/admin/promotion/60661304257_1569224434323.png
             * short_image_url :
             * horizontal_image_url :
             * diy_ad_proportion : 0
             * third_ad_proportion : 10:0
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String bundle_id;
            private String image_url;
            private String short_image_url;
            private String horizontal_image_url;
            private String diy_ad_proportion;
            private String third_ad_proportion;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }

            public String getDiy_ad_proportion() {
                return diy_ad_proportion;
            }

            public void setDiy_ad_proportion(String diy_ad_proportion) {
                this.diy_ad_proportion = diy_ad_proportion;
            }

            public String getThird_ad_proportion() {
                return third_ad_proportion;
            }

            public void setThird_ad_proportion(String third_ad_proportion) {
                this.third_ad_proportion = third_ad_proportion;
            }
        }
    }

    public static class OtherI2125Bean {
        /**
         * success : true
         * data : [{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","before_ad_proportion":"10:0:0","after_ad_proportion":"9:0:1","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","video_id":"","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","image_gif":"http://img5g22.ergedd.com/admin/promotion/27247947657_1570604919271.gif","short_image_url":"","horizontal_image_url":""},{"id":46,"group":"promotion_banner","field":"right-3TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-3","title":"巴塔木英文歌","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/10","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/14268770968_1564568296712.jpg","short_image_url":"","horizontal_image_url":""},{"id":45,"group":"promotion_banner","field":"right-4TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-4","title":"睡衣小英雄","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/649","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/96182197450_1564568352960.jpg","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/175","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/33472971605_1573804687717.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"超级飞侠","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/562","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/36170542987_1573804712860.png","short_image_url":"","horizontal_image_url":""}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXX> data) {
            this.data = data;
        }

        public static class DataBeanXX {
            /**
             * id : 16
             * group : promotion_banner
             * field : left
             * min_version :
             * max_version :
             * diy_ad_proportion : 0
             * third_ad_proportion : 10:0
             * before_ad_proportion : 10:0:0
             * after_ad_proportion : 9:0:1
             * position : left
             * title : 小猪佩奇
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * video_id :
             * bundle_id : com.mampod.ergedd
             * image_url : http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png
             * image_gif : http://img5g22.ergedd.com/admin/promotion/27247947657_1570604919271.gif
             * short_image_url :
             * horizontal_image_url :
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String diy_ad_proportion;
            private String third_ad_proportion;
            private String before_ad_proportion;
            private String after_ad_proportion;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String video_id;
            private String bundle_id;
            private String image_url;
            private String image_gif;
            private String short_image_url;
            private String horizontal_image_url;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getDiy_ad_proportion() {
                return diy_ad_proportion;
            }

            public void setDiy_ad_proportion(String diy_ad_proportion) {
                this.diy_ad_proportion = diy_ad_proportion;
            }

            public String getThird_ad_proportion() {
                return third_ad_proportion;
            }

            public void setThird_ad_proportion(String third_ad_proportion) {
                this.third_ad_proportion = third_ad_proportion;
            }

            public String getBefore_ad_proportion() {
                return before_ad_proportion;
            }

            public void setBefore_ad_proportion(String before_ad_proportion) {
                this.before_ad_proportion = before_ad_proportion;
            }

            public String getAfter_ad_proportion() {
                return after_ad_proportion;
            }

            public void setAfter_ad_proportion(String after_ad_proportion) {
                this.after_ad_proportion = after_ad_proportion;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getVideo_id() {
                return video_id;
            }

            public void setVideo_id(String video_id) {
                this.video_id = video_id;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getImage_gif() {
                return image_gif;
            }

            public void setImage_gif(String image_gif) {
                this.image_gif = image_gif;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }
        }
    }

    public static class OtherI2129Bean {
        /**
         * success : true
         * message : Get app configs successfully
         * data : [{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","before_ad_proportion":"10:0:0","after_ad_proportion":"9:0:1","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","video_id":"","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/61975926833_1576046042005.png","image_gif":"","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"萌鸡小队","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/532","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/64187463675_1576046119981.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/175","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/17058139865_1576046139785.png","short_image_url":"","horizontal_image_url":""},{"id":45,"group":"promotion_banner","field":"right-4TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-4","title":"睡衣小英雄","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/649","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/47766972914_1576143741974.png","short_image_url":"","horizontal_image_url":""},{"id":46,"group":"promotion_banner","field":"right-3TO","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-3","title":"小马宝莉","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/233","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/app_ads/79167589190_1589164693524.png","short_image_url":"","horizontal_image_url":""}]
         */

        private boolean success;
        private String message;
        private List<DataBeanXXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXX {
            /**
             * id : 16
             * group : promotion_banner
             * field : left
             * min_version :
             * max_version :
             * diy_ad_proportion : 0
             * third_ad_proportion : 10:0
             * before_ad_proportion : 10:0:0
             * after_ad_proportion : 9:0:1
             * position : left
             * title : 小猪佩奇
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * video_id :
             * bundle_id : com.mampod.ergedd
             * image_url : http://img5g22.ergedd.com/admin/promotion/61975926833_1576046042005.png
             * image_gif :
             * short_image_url :
             * horizontal_image_url :
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String diy_ad_proportion;
            private String third_ad_proportion;
            private String before_ad_proportion;
            private String after_ad_proportion;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String video_id;
            private String bundle_id;
            private String image_url;
            private String image_gif;
            private String short_image_url;
            private String horizontal_image_url;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getDiy_ad_proportion() {
                return diy_ad_proportion;
            }

            public void setDiy_ad_proportion(String diy_ad_proportion) {
                this.diy_ad_proportion = diy_ad_proportion;
            }

            public String getThird_ad_proportion() {
                return third_ad_proportion;
            }

            public void setThird_ad_proportion(String third_ad_proportion) {
                this.third_ad_proportion = third_ad_proportion;
            }

            public String getBefore_ad_proportion() {
                return before_ad_proportion;
            }

            public void setBefore_ad_proportion(String before_ad_proportion) {
                this.before_ad_proportion = before_ad_proportion;
            }

            public String getAfter_ad_proportion() {
                return after_ad_proportion;
            }

            public void setAfter_ad_proportion(String after_ad_proportion) {
                this.after_ad_proportion = after_ad_proportion;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getVideo_id() {
                return video_id;
            }

            public void setVideo_id(String video_id) {
                this.video_id = video_id;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getImage_gif() {
                return image_gif;
            }

            public void setImage_gif(String image_gif) {
                this.image_gif = image_gif;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }
        }
    }

    public static class OtherA2808Bean {
        /**
         * success : true
         * data : [{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"超级飞侠","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/562","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/36170542987_1573804712860.png","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","grade":0,"status":"1","url":"ergedd://album/175","image_url":"http://img5g22.ergedd.com/admin/promotion/33472971605_1573804687717.png","short_image_url":"","horizontal_image_url":""}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanXXXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXXX {
            /**
             * id : 16
             * group : promotion_banner
             * field : left
             * min_version :
             * max_version :
             * position : left
             * title : 小猪佩奇
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * bundle_id : com.mampod.ergedd
             * image_url : http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png
             * short_image_url :
             * horizontal_image_url :
             * diy_ad_proportion : 0
             * third_ad_proportion : 10:0
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String bundle_id;
            private String image_url;
            private String short_image_url;
            private String horizontal_image_url;
            private String diy_ad_proportion;
            private String third_ad_proportion;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }

            public String getDiy_ad_proportion() {
                return diy_ad_proportion;
            }

            public void setDiy_ad_proportion(String diy_ad_proportion) {
                this.diy_ad_proportion = diy_ad_proportion;
            }

            public String getThird_ad_proportion() {
                return third_ad_proportion;
            }

            public void setThird_ad_proportion(String third_ad_proportion) {
                this.third_ad_proportion = third_ad_proportion;
            }
        }
    }

    public static class OtherIa2129Bean {
        /**
         * success : true
         * data : [{"id":95,"group":"promotion_audio_banner","field":"left","min_version":"","max_version":"","position":"left","title":"哈利讲故事","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://audio/playlist/258","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/89086820861_1576130752371.png","short_image_url":"","horizontal_image_url":""},{"id":96,"group":"promotion_audio_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"经典儿歌","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://audio/playlist/194","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/3750444586_1576130803746.png","short_image_url":"","horizontal_image_url":""},{"id":94,"group":"promotion_audio_banner","field":"right-top","min_version":"","max_version":"","position":"right-top","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://audio/playlist/261","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/32147354164_1576130783690.png","short_image_url":"","horizontal_image_url":""},{"id":101,"group":"promotion_audio_banner","field":"right-3","position":"right-3","title":"恐龙儿歌","channel":"","status":"1","url":"ergedd://audio/playlist/420","image_url":"http://img5g22.ergedd.com/admin/promotion/17054560114_1579516284762.png","short_image_url":"","horizontal_image_url":""},{"id":102,"group":"promotion_audio_banner","field":"right-4","position":"right-4","title":"动物儿歌","channel":"","status":"1","url":"ergedd://audio/playlist/251","image_url":"http://img5g22.ergedd.com/admin/promotion/19819593104_1576130883010.png","short_image_url":"","horizontal_image_url":""}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanXXXXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXXXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXXXX {
            /**
             * id : 95
             * group : promotion_audio_banner
             * field : left
             * min_version :
             * max_version :
             * position : left
             * title : 哈利讲故事
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://audio/playlist/258
             * bundle_id :
             * image_url : http://img5g22.ergedd.com/admin/promotion/89086820861_1576130752371.png
             * short_image_url :
             * horizontal_image_url :
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String bundle_id;
            private String image_url;
            private String short_image_url;
            private String horizontal_image_url;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }
        }
    }

    public static class OtherANewui12Bean {
        /**
         * success : true
         * data : [{"id":100,"name":"交通安全","image":"http://img5g22.ergedd.com/video/21163_1546062351866.jpg","type":"110"},{"id":101,"name":"睡前故事","image":"http://img5g22.ergedd.com/video/21163_1546062351866.jpg","type":"112"},{"id":102,"name":"生活好习惯","image":"http://img5g22.ergedd.com/video/21163_1546062351866.jpg","type":"113"}]
         * message : Get album categories successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanXXXXXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXXXXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXXXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXXXXX {
            /**
             * id : 100
             * name : 交通安全
             * image : http://img5g22.ergedd.com/video/21163_1546062351866.jpg
             * type : 110
             */

            private int id;
            private String name;
            private String image;
            private String type;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class OtherA200720Bean {
        /**
         * success : true
         * data : [{"id":16,"group":"promotion_banner","field":"left","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"com.mampod.ergedd","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","short_image_url":"","horizontal_image_url":""},{"id":17,"group":"promotion_banner","field":"right-top","min_version":"","max_version":"","diy_ad_proportion":"0","third_ad_proportion":"10:0","position":"right-top","title":"经典中文儿歌","channel":"","grade":0,"rank":"","promotion_group":"","status":"1","url":"ergedd://album/575","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/app_ads/33735076246_1595301754734.jpg","short_image_url":"","horizontal_image_url":""},{"id":18,"group":"promotion_banner","field":"right-bottom","min_version":"","max_version":"","position":"right-bottom","title":"恐龙儿歌","channel":"","grade":0,"status":"1","url":"ergedd://album/699","image_url":"http://img5g22.ergedd.com/admin/app_ads/96932284097_1595302619317.jpg","short_image_url":"","horizontal_image_url":""}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanXXXXXXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXXXXXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXXXXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXXXXXX {
            /**
             * id : 16
             * group : promotion_banner
             * field : left
             * min_version :
             * max_version :
             * position : left
             * title : 小猪佩奇
             * channel :
             * grade : 0
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * bundle_id : com.mampod.ergedd
             * image_url : http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png
             * short_image_url :
             * horizontal_image_url :
             * diy_ad_proportion : 0
             * third_ad_proportion : 10:0
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String position;
            private String title;
            private String channel;
            private int grade;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String bundle_id;
            private String image_url;
            private String short_image_url;
            private String horizontal_image_url;
            private String diy_ad_proportion;
            private String third_ad_proportion;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getGrade() {
                return grade;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getShort_image_url() {
                return short_image_url;
            }

            public void setShort_image_url(String short_image_url) {
                this.short_image_url = short_image_url;
            }

            public String getHorizontal_image_url() {
                return horizontal_image_url;
            }

            public void setHorizontal_image_url(String horizontal_image_url) {
                this.horizontal_image_url = horizontal_image_url;
            }

            public String getDiy_ad_proportion() {
                return diy_ad_proportion;
            }

            public void setDiy_ad_proportion(String diy_ad_proportion) {
                this.diy_ad_proportion = diy_ad_proportion;
            }

            public String getThird_ad_proportion() {
                return third_ad_proportion;
            }

            public void setThird_ad_proportion(String third_ad_proportion) {
                this.third_ad_proportion = third_ad_proportion;
            }
        }
    }

    public static class OtherA2007201Bean {
        /**
         * success : true
         * data : [{"id":533,"group":"video_banner","field":"leftTO","min_version":"","max_version":"","position":"left","title":"小猪佩奇","channel":"","rank":"","promotion_group":"","status":"1","url":"ergedd://album/33","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png","albums":{"id":33,"free":5,"is_vip":2,"price":0,"vip_price":0}},{"id":531,"group":"video_banner","field":"right-bottomTO","min_version":"","max_version":"","position":"right-bottom","title":"汪汪队立大功","channel":"","rank":"","promotion_group":"","status":"1","url":"ergedd://album/175","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/33472971605_1573804687717.png","albums":{"id":175,"free":5,"is_vip":2,"price":0,"vip_price":0}},{"id":532,"group":"video_banner","field":"right-topTO","min_version":"","max_version":"","position":"right-top","title":"超级飞侠","channel":"","rank":"","promotion_group":"","status":"1","url":"ergedd://album/562","bundle_id":"","image_url":"http://img5g22.ergedd.com/admin/promotion/36170542987_1573804712860.png","albums":{"id":562,"free":5,"is_vip":2,"price":0,"vip_price":0}}]
         * message : Get app configs successfully
         */

        private boolean success;
        private String message;
        private List<DataBeanXXXXXXXX> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<DataBeanXXXXXXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXXXXXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXXXXXXX {
            /**
             * id : 533
             * group : video_banner
             * field : leftTO
             * min_version :
             * max_version :
             * position : left
             * title : 小猪佩奇
             * channel :
             * rank :
             * promotion_group :
             * status : 1
             * url : ergedd://album/33
             * bundle_id :
             * image_url : http://img5g22.ergedd.com/admin/promotion/92928682101_1573804656645.png
             * albums : {"id":33,"free":5,"is_vip":2,"price":0,"vip_price":0}
             */

            private int id;
            private String group;
            private String field;
            private String min_version;
            private String max_version;
            private String position;
            private String title;
            private String channel;
            private String rank;
            private String promotion_group;
            private String status;
            private String url;
            private String bundle_id;
            private String image_url;
            private AlbumsBean albums;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public String getMax_version() {
                return max_version;
            }

            public void setMax_version(String max_version) {
                this.max_version = max_version;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getPromotion_group() {
                return promotion_group;
            }

            public void setPromotion_group(String promotion_group) {
                this.promotion_group = promotion_group;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getBundle_id() {
                return bundle_id;
            }

            public void setBundle_id(String bundle_id) {
                this.bundle_id = bundle_id;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public AlbumsBean getAlbums() {
                return albums;
            }

            public void setAlbums(AlbumsBean albums) {
                this.albums = albums;
            }

            public static class AlbumsBean {
                /**
                 * id : 33
                 * free : 5
                 * is_vip : 2
                 * price : 0
                 * vip_price : 0
                 */

                private int id;
                private int free;
                private int is_vip;
                private int price;
                private int vip_price;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getFree() {
                    return free;
                }

                public void setFree(int free) {
                    this.free = free;
                }

                public int getIs_vip() {
                    return is_vip;
                }

                public void setIs_vip(int is_vip) {
                    this.is_vip = is_vip;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getVip_price() {
                    return vip_price;
                }

                public void setVip_price(int vip_price) {
                    this.vip_price = vip_price;
                }
            }
        }
    }

    public static class ErgeddGreetIosBean {
        /**
         * start : 6:00
         * end : 7:00
         */

        private String start;
        private String end;

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }
    }

    public static class ErgeddGreetAndroidBean {
        /**
         * start : 6:00
         * end : 7:00
         */

        private String start;
        private String end;

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }
    }


}
