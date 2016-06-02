package com.cpl.restaurantrezervation.application;

import com.cpl.restaurantrezervation.model.User;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by txhung08 on 01/06/16.
 */
public interface ReservedAPI {
    @GET("user/login/{email}/{password}")
    Call<User> authenticate(@Path(value = "email", encoded = true) String email,
                            @Path(value = "password", encoded = true) String password);

    @GET("user/create/{email}/{password}")
    Call<User> register(@Path(value = "email", encoded = true) String email,
                            @Path(value = "password", encoded = true) String password);
}
