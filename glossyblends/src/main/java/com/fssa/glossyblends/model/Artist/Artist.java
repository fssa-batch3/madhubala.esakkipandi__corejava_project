package com.fssa.glossyblends.model.Artist;
import java.util.List;

public class Artist {
    private String artistId;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private int yearsOfExperience;
    private boolean isAvailable;    
	private List<Post> workLink; 
    private List<Services>providingServices;
    private List<schedule>workingDaysCalender;
    private gender genderOfArtist;
    private List<String> portfolio; 
    private List<String> socialMediaLinks; 
    private List<String> languagesSpoken; 
    private String location; 
    private double averageRating; 
    private List<String> reviews;
    
    
    
    //ENUM for gender 
    
    public enum gender{
    	
    	FEMALE,
    	MALE,
    	TRANSGENDER
    	
    	
    }

    ///working blocking day calendar
    public List<schedule> getWorkingDaysCalender() {
		return workingDaysCalender;
	}
	public void setWorkingDaysCalender(List<schedule> workingDaysCalender) {
		this.workingDaysCalender = workingDaysCalender;
	}
	
	
	
	//Service providing calendar
	public List<Services> getProvidingServices() {
		return providingServices;
	}
	public void setProvidingServices(List<Services> providingServices) {
		this.providingServices = providingServices;
	}
	
	
	///post url
	public List<Post> getPostUrl() {
		return workLink;
	}
	public void setPostUrl(List<Post> workLink) {
		this.workLink = workLink;
	}
	
	
	//Artist id
    public String getArtistId() {
		return artistId;
	}
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	
	//artist name
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//artist password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	//artist email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//artist mobile number
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	//year of experience
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	
	///availability of artist
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	//location of artist
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	//average rating for artist
	
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	
	
	///list of reviews for artist
	public List<String> getReviews() {
		return reviews;
	}
	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}
	
	
	///Profile of artist
	public List<String> getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(List<String> portfolio) {
		this.portfolio = portfolio;
	}
	
	
	//social media link 
	public List<String> getSocialMediaLinks() {
		return socialMediaLinks;
	}
	public void setSocialMediaLinks(List<String> socialMediaLinks) {
		this.socialMediaLinks = socialMediaLinks;
	}
	
	//languages spoken 
	
	public List<String> getLanguagesSpoken() {
		return languagesSpoken;
	}
	public void setLanguagesSpoken(List<String> languagesSpoken) {
		this.languagesSpoken = languagesSpoken;
	}
	
	
	//gender of artist 
	
	public gender getGenderOfArtist() {
		return genderOfArtist;
	}
	public void setGenderOfArtist(gender genderOfArtist) {
		this.genderOfArtist = genderOfArtist;
	}
	


}
