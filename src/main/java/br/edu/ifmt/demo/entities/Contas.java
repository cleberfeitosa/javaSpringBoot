package br.edu.ifmt.demo.entities;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class Contas {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@Column(name = "desc")
		private String descricao;
		private float valor;
		private Date data;
		
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "contas_category_id", referencedColumnName = "id")
		private Categoria categoria;
		
		

		public Contas() {
			
		}
		
		

		public Contas(Long id, String descricao, float valor, Date data, Categoria categoria) {
			this.id = id;
			this.descricao = descricao;
			this.valor = valor;
			this.data = data;
			this.categoria = categoria;
		}



		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
		
}
