package com.mydating.dating.util;

import java.util.Comparator;

import com.mydating.dating.dto.MatchingUser;

public class UserSorting implements Comparator<MatchingUser> {

	@Override
	public int compare(MatchingUser o1, MatchingUser o2) {
		if(o1.getAd()<o2.getAd())
			return -1;
		else if(o1.getAd()>o2.getAd())
			return 1;
		else {
			if(o1.getImc()<o2.getImc())
				return 1;
			else if(o1.getImc()>o2.getImc())
				return -1;
			else
				return 0;
		}
	}

}
