package com.study.neo4j.service;

import org.springframework.stereotype.Service;

import com.study.neo4j.domain.Company;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:42
 */
@Service
public interface CompaynService {
    Company save(Company company);
    void delete(Company company);
    Company findById(Long id);
    Iterable<Company> findAll();

    void deleteAll();
}
