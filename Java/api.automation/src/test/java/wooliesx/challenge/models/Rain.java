package wooliesx.challenge.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
	private Double data;

	@JsonProperty("3h")
    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }
}
