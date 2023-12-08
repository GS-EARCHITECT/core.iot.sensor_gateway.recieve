package kafka_message_mgmt.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class GatewayAssetReading implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long readingSeqNo;
	private Long assetSeqNo;
	private Timestamp onDttm;
	private Float reading;
	private Long sensorAssetSeqNo;
	private Long resMeasureSeqNo;

	public Long getReadingSeqNo() {
		return readingSeqNo;
	}

	public void setReadingSeqNo(Long readingSeqNo) {
		this.readingSeqNo = readingSeqNo;
	}

	public Long getAssetSeqNo() {
		return assetSeqNo;
	}

	public void setAssetSeqNo(Long assetSeqNo) {
		this.assetSeqNo = assetSeqNo;
	}

	public Timestamp getOnDttm() {
		return onDttm;
	}

	public void setOnDttm(Timestamp onDttm) {
		this.onDttm = onDttm;
	}

	public Float getReading() {
		return reading;
	}

	public void setReading(Float reading) {
		this.reading = reading;
	}

	public Long getSensorAssetSeqNo() {
		return sensorAssetSeqNo;
	}

	public void setSensorAssetSeqNo(Long sensorAssetSeqNo) {
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

	public Long getResMeasureSeqNo() {
		return resMeasureSeqNo;
	}

	public void setResMeasureSeqNo(Long resMeasureSeqNo) {
		this.resMeasureSeqNo = resMeasureSeqNo;
	}

	public GatewayAssetReading(Long readingSeqNo, Long assetSeqNo, Timestamp onDttm, Float reading,
			Long sensorAssetSeqNo, Long resMeasureSeqNo) {
		super();
		this.readingSeqNo = readingSeqNo;
		this.assetSeqNo = assetSeqNo;
		this.onDttm = onDttm;
		this.reading = reading;
		this.sensorAssetSeqNo = sensorAssetSeqNo;
		this.resMeasureSeqNo = resMeasureSeqNo;
	}

	public GatewayAssetReading() {
		super();
	}

}