package com.kate.paypalclone.repository;

import com.kate.paypalclone.model.UsersModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class UsersRepositoryImpl implements UsersRepository{
    @Override
    public Optional<UsersModel> findByEmailAndPassword(String email, String password) {
        return Optional.empty();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UsersModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UsersModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UsersModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UsersModel getOne(Integer integer) {
        return null;
    }

    @Override
    public UsersModel getById(Integer integer) {
        return null;
    }

    @Override
    public UsersModel getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends UsersModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UsersModel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UsersModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UsersModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UsersModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UsersModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UsersModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UsersModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsersModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UsersModel> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<UsersModel> findAll() {
        return null;
    }

    @Override
    public List<UsersModel> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(UsersModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsersModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UsersModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UsersModel> findAll(Pageable pageable) {
        return null;
    }
}
