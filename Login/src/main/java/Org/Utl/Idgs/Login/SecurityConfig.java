package Org.Utl.Idgs.Login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filtroSeguridad(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/inicio-sesion", "/error").permitAll()
                .requestMatchers("/css/**", "/js/**", "/images/**", "/webjars/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(login -> login
                .loginPage("/inicio-sesion")
                .loginProcessingUrl("/inicio-sesion")
                .usernameParameter("usuario")
                .passwordParameter("contrasena")
                .failureUrl("/inicio-sesion?error")
                .defaultSuccessUrl("/principal", true)
                .permitAll()
            )
            .logout(logout -> logout.permitAll());
        return http.build();
    }
}
