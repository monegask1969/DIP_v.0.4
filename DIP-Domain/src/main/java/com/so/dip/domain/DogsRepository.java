/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dip.domain;

/**
 *
 * @author moneg
 */
public interface DogsRepository extends JpaRepository<Dogs,Long>{
    @Query("Select d Dogs d FROM Dogs Where name:=bla ")
    Dogs findByName( @Parametr(name="bla")int id);
}
