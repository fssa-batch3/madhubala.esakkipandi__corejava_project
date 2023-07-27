package com.fssa.glossyblends.Validator;

import com.fssa.glossyblends.model.Artist.ErrorMessages;
import com.fssa.glossyblends.model.Artist.Post;

public class PostValidations {

	public static boolean ValidationOfPost(Post post) throws IllegalArgumentException {

		if (post == null) {

			throw new IllegalArgumentException(ErrorMessages.INVALID_SERVICE_NAME_NULL);
		}

		else {

			ValidateTitle(post.getTitle());
			ValidateImageurl(post.getPostUrl());
			ValidateDescription(post.getDescription());

		}
		return false;
	}

	private static boolean ValidateTitle(String title) throws IllegalArgumentException {

		if (title == null) {

			throw new IllegalArgumentException(ErrorMessages.INVALID_SERVICE_NAME_NULL);
		}

		ArtistNameValidations.validateName(title);
return true;
	}

	private static boolean ValidateDescription(String description) throws IllegalArgumentException {

		if (description.length() < 15) {

			throw new IllegalArgumentException(ErrorMessages.DESCRIPTION_LENGTH_FORMAT);
		}

		ArtistNameValidations.validateName(description);
return true;
	}

	private static boolean ValidateImageurl(String title) throws IllegalArgumentException {

		ImageUrlValidations.validateImageUrl(title);
return true;
	}

}
