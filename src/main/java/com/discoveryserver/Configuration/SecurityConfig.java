//package com.discoveryserver.Configuration;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.csrf().and()
//                .cors().disable().build();
//    }
//
//    @Bean
//    UserDetailsService userDetailsService(){
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("yassine")
//                        .password("root")
//                        .roles("ADMIN")
//                        .build();
//        return new InMemoryUserDetailsManager(user);
//    }
//
//}
