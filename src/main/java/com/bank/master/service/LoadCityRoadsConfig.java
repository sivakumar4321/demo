package com.bank.master.service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class LoadCityRoadsConfig {
 @Bean
 @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
 public LoadCityRoads getLoadCityRoadService() {
  return new LoadCityRoads();
 }
}
