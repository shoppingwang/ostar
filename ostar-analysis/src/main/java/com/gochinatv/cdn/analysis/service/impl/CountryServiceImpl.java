package com.gochinatv.cdn.analysis.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.gochinatv.cdn.po.analysis.Country;
import com.gochinatv.cdn.service.analysis.CountryService;
import com.gochinatv.cdn.service.impl.BaseService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

@Service(protocol = {"dubbo", "rest"})
public class CountryServiceImpl extends BaseService<Country> implements CountryService
{
    @Override
    public List<Country> findAll()
    {
        return selectByExample(new Example(Country.class));
    }

    @Override
    public List<Country> selectByCountry(Country country, int page, int rows)
    {
        Example example = new Example(Country.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(country.getCountryname()))
        {
            criteria.andLike("countryname", "%" + country.getCountryname() + "%");
        }
        if (StringUtil.isNotEmpty(country.getCountrycode()))
        {
            criteria.andLike("countrycode", "%" + country.getCountrycode() + "%");
        }
        if (country.getId() != null)
        {
            criteria.andEqualTo("id", country.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }

}
