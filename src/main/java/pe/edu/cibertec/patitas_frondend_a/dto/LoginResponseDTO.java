package pe.edu.cibertec.patitas_frondend_a.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public record LoginResponseDTO(String codigo, String mensaje, String nombreUsuario, String correoUsuario) {

}
