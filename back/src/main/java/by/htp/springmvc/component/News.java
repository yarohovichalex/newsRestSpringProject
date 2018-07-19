package by.htp.springmvc.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
	private int id;
	
    @Column (name = "publisherId")
	private int publisherId;
    
    @Column (name = "title")
	private String title;
    
    @Column (name = "imagePath")
	private String imagePath;
    
    @Column (name = "shortDescription")
    private String shortDescription;
    
    @Column (name = "fullDescription")
    private String fullDescription;

	public News() {
		super();
	}

	public News(int id, int publisherId, String title, String imagePath, String shortDescription, String fullDescription) {
		this.id = id;
		this.publisherId = publisherId;
		this.title = title;
		this.imagePath = imagePath;
		this.shortDescription = shortDescription;
		this.fullDescription = fullDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullDescription == null) ? 0 : fullDescription.hashCode());
		result = prime * result + id;
		result = prime * result + ((imagePath == null) ? 0 : imagePath.hashCode());
		result = prime * result + publisherId;
		result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		if (fullDescription == null) {
			if (other.fullDescription != null)
				return false;
		} else if (!fullDescription.equals(other.fullDescription))
			return false;
		if (id != other.id)
			return false;
		if (imagePath == null) {
			if (other.imagePath != null)
				return false;
		} else if (!imagePath.equals(other.imagePath))
			return false;
		if (publisherId != other.publisherId)
			return false;
		if (shortDescription == null) {
			if (other.shortDescription != null)
				return false;
		} else if (!shortDescription.equals(other.shortDescription))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", publisherId=" + publisherId + ", title=" + title + ", imagePath=" + imagePath + ", shortDescription=" + shortDescription + ", fullDescription=" + fullDescription + "]";
	}
	
	
}
