package com.netflix.apirest.servicios;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.netflix.apirest.entidades.Title;
import com.netflix.apirest.repositorios.TitleRepository;

@Service
public class TitleService {

	@Autowired
	private TitleRepository titleRepository;

	public List<Title> getAll() {
		return titleRepository.findAll();
	}

	public Title getOne(int id) {
		return titleRepository.findById(id).orElse(null);
	}

	public void deletebyId(int id) {
		titleRepository.deleteById(id);
	}

	public Title save(Title title) {
		return titleRepository.save(title);
	}

//	public List<Title> getBest(Pageable limit) {
//		return titleRepository.findAllOrderByRatingDesc(limit);
//	}
//
//	public List<Title> getMostExpensive(Pageable limit) {
//		return titleRepository.findAllOrderByPriceDesc(limit);
//	}
//
//	public List<Title> getBestBangForTheBuck(Pageable limit) {
//		return titleRepository.findBestBangForTheBuck(limit);
//	}
//
//	public HashMap<String, List<Title>> getVintageList(Pageable limit) {
//		List<String> yearsWithBestRatedTitle = titleRepository.findYearsWithBestRatedTitles(limit);
//		HashMap<String, List<Title>> topTitles = new HashMap<>();
//
//		for (String year : yearsWithBestRatedTitle) {
//			List<Title> titles = titleRepository.findByYear(year);
//			topTitles.put(year, titles);
//		}
//
//		return topTitles;
//	}
}