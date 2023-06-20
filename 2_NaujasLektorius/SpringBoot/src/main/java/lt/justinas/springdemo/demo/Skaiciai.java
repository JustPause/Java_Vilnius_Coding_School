package lt.justinas.springdemo.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skaiciai")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Skaiciai {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "pavadinimas")
	private String pavadinimas;

	@Column(name = "skaicus")
	private Long skaicus;

	@Column(name = "valiuta")
	private String valiuta;

	@OneToMany(mappedBy = "skaicius", cascade = CascadeType.ALL)
	 List<Komentaras> komentarai = new ArrayList<>();


	public Skaiciai(String pavadinimas, Long skaicus, String valiuta) {
		this.pavadinimas = pavadinimas;
		this.skaicus = skaicus;
		this.valiuta = valiuta;
	}

}