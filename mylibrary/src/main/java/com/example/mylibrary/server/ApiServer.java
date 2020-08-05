package com.example.mylibrary.server;

import com.google.gson.JsonElement;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.PartMap;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface ApiServer {

    /*
    DELETE注解:d
    用于发送一个DELETE请求
    DELETE注解一般必须添加相对路径或绝对路径或者全路径,如果不想在DELETE注解后添加请求路径,则可以在方法的第一个参数中用@Url注解添加请求路径

    FormUrlEncoded注解:
    用于修饰Field注解和FieldMap注解
    使用该注解,表示请求正文将使用表单网址编码。字段应该声明为参数，并用@Field注释或FieldMap注释。
    使用FormUrlEncoded注解的请求将具”application / x-www-form-urlencoded” MIME类型。字段名称和值将先进行UTF-8进行编码,再根据RFC-3986进行URI编码
     */
    @GET
    Observable<JsonElement> get(@Url String url, @QueryMap Map<String,Object>params, @HeaderMap Map<String,Object>heards);

    //上传表单
    @POST
    @FormUrlEncoded
    Observable<JsonElement>post(@Url String url, @FieldMap Map<String ,Object>params,@HeaderMap Map<String,Object>heards);

    //上传json
    @POST
    Observable<JsonElement>postjson(@Url String url,RequestBody requestBody,@HeaderMap Map<String,Object>heards);

    @DELETE
    Observable<JsonElement>delete(@Url String url,@QueryMap Map<String,Object>params,  @HeaderMap Map<String,Object>heards);

    @PUT
    @FormUrlEncoded
    Observable<JsonElement>put(@Url String url,@FieldMap Map<String,Object>params,  @HeaderMap Map<String,Object>heards);

    //上传文件
    @Multipart
    @POST
    Observable<JsonElement>upload(@Url String url, @PartMap Map<String,Object>params, List<MultipartBody.Part>fileList);

    //下载文件
    @Streaming
    Observable<ResponseBody>download(@Url String url,@QueryMap Map<String,Object>params,  @HeaderMap Map<String,Object>heards);



}
