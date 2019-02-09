package com.mycompany.foodrecognition;

//http://ai.baidu.com/docs#/Auth/top

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FoodRecognizeService {

    @POST("/oauth/2.0/token?grant_type=client_credentials&client_id=d18GBBTIH2rI1aafFBlWntd7&client_secret=byfHEajLOZPjFoyK8HfvZEj66elkrtyx")
    Observable<AccessTokenResponse> getAccessToken();


    @FormUrlEncoded
    @POST("/rest/2.0/image-classify/v2/dish?access_token=24.418536b03c005a991b7228d8e8d8ea3a.2592000.1552281813.282335-15504998")
    Observable<FoodRecognizeResponse> foodRecognize(@Field("image") String image, @Field("top_num") int top_num, @Field("filter_threshold") float filter_threshold, @Field("baike_num") int baike_num);
}
