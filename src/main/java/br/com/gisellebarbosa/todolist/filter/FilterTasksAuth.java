package br.com.gisellebarbosa.todolist.filter;

import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTasksAuth extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {

    // Pegar a autenticação (usuário / senha)
    var authorization = request.getHeader("Authorization");

    var authEncoded = authorization.substring("Basic".length()).trim();

    byte[] authDecode = Base64.getDecoder().decode(authEncoded);
    var authString = new String(authDecode);

    System.out.println("Authorization");
    System.out.println(authString);

    String[] credentials = authString.split(":");
    String username = credentials[0];
    String password = credentials[1];

    System.out.println(username);
    System.out.println(password);

    // Validar usuário

    // Validar senha

    // TODO: Tudo ok

    filterChain.doFilter(request, response);

  }

}
