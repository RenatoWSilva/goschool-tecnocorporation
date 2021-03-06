package br.com.goschool.goschool_mobile.Aplication;

import java.util.List;

import br.com.goschool.goschool_mobile.Modulos.Motorista;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface IMostoristaREST {
    @POST("Livros/webresources/br.ufs.tep.livros/inserir")
    Call<Void> insereMotorista(@Body Motorista motorista);

    @GET("Livros/webresources/br.ufs.tep.livros")
    Call<List<Motorista>> getMotorista();

    @GET("Livros/webresources/br.ufs.tep.livros/buscar/{id}")
    Call<Motorista> getMotoristaPorId(@Path("id") String id);

    @PUT("Livros/webresources/br.ufs.tep.livros/editar/{id}")
    Call<Void> alteraMotorista(@Path("id") String id, @Body Motorista motorista);

    @DELETE("Livros/webresources/br.ufs.tep.livros/remover/{id}")
    Call<Void> removeMotorista(@Path("id") String id);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
