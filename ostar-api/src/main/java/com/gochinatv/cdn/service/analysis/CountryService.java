package com.gochinatv.cdn.service.analysis;


import com.gochinatv.cdn.po.analysis.Country;
import com.gochinatv.cdn.service.IService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("country")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface CountryService extends IService<Country>
{
    @GET
    @Path("findAll")
    List<Country> findAll();

    /**
     * 根据条件分页查询
     */
    List<Country> selectByCountry(Country country, int page, int rows);
}
