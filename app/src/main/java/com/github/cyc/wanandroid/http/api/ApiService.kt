package com.github.cyc.wanandroid.http.api

import com.github.cyc.wanandroid.http.model.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * 网络请求描述接口
 */
interface ApiService {

    /**
     * 获取首页Banner数据
     *
     * @return Banner数据
     */
    @GET("banner/json")
    fun getBannerData(): Observable<Response<List<Banner>>>

    /**
     * 获取首页置顶文章列表数据
     *
     * @return 置顶文章列表数据
     */
    @GET("article/top/json")
    fun getTopArticleListData(): Observable<Response<List<Article>>>

    /**
     * 获取首页文章列表数据
     *
     * @param pageNum 页数
     * @return 文章列表数据
     */
    @GET("article/list/{pageNum}/json")
    fun getArticleListData(@Path("pageNum") pageNum: Int): Observable<Response<ArticleList>>

    /**
     * 获取体系列表数据
     *
     * @return 体系列表数据
     */
    @GET("tree/json")
    fun getSystemListData(): Observable<Response<List<Chapter>>>

    /**
     * 获取公众号列表数据
     *
     * @return 公众号列表数据
     */
    @GET("wxarticle/chapters/json")
    fun getWeChatListData(): Observable<Response<List<Chapter>>>

    /**
     * 获取某个公众号文章列表数据
     *
     * @param id      公众号ID
     * @param pageNum 页数
     * @return 公众号文章列表数据
     */
    @GET("wxarticle/list/{id}/{pageNum}/json")
    fun getWeChatArticleListData(@Path("id") id: Int, @Path("pageNum") pageNum: Int): Observable<Response<ArticleList>>

    /**
     * 获取导航列表数据
     *
     * @return 导航列表数据
     */
    @GET("navi/json")
    fun getNavigationListData(): Observable<Response<List<Navigation>>>

    /**
     * 获取项目分类列表数据
     *
     * @return 项目分类列表数据
     */
    @GET("project/tree/json")
    fun getProjectListData(): Observable<Response<List<Chapter>>>

    /**
     * 获取某个项目分类文章列表数据
     *
     * @param id      项目分类ID
     * @param pageNum 页数
     * @return 项目分类文章列表数据
     */
    @GET("project/list/{pageNum}/json")
    fun getProjectArticleListData(@Path("pageNum") pageNum: Int, @Query("cid") id: Int): Observable<Response<ArticleList>>

}