package br.com.quiz.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class MapperAbstract<FROM extends Object, TO extends Object> {
	
	
	public List<TO> convertTO(Iterable<FROM> fromIterable){
		
		if(fromIterable == null || !fromIterable.iterator().hasNext()){
			return new ArrayList<>();
		}
		
		List<TO> listTO = new ArrayList<>();
		while(fromIterable.iterator().hasNext()){
			FROM element = fromIterable.iterator().next();
			listTO.add(convertTO(element));
		}
		
		return listTO;
	}
	
	public abstract TO convertTO(FROM from);
}
