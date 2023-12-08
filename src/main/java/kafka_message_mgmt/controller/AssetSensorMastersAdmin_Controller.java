package kafka_message_mgmt.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
@RestController
@RequestMapping("/assetSensorMastersManagement")
public class AssetSensorMastersAdmin_Controller {

	// private static final Logger logger =
	// LoggerFactory.getLogger(AssetSensorMaster_Controller.class);

	@Autowired
	private I_AssetSensorMastersAdmin_Service assetSensorMastersAdminService;

	@PostMapping("/new")
	public ResponseEntity<AssetSensorMaster_DTO> newAssetSensorMaster(@RequestBody AssetSensorMaster_DTO AssetSensorMasterDTO) {
		AssetSensorMaster_DTO AssetSensorMasterDTO2 = assetSensorMastersAdminService.newAssetSensor(AssetSensorMasterDTO);
		HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<>(AssetSensorMasterDTO2, httpHeaders, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllAssetSensorMasters", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<AssetSensorMaster_DTO>> getAllAssetSensorMasters() {
		ArrayList<AssetSensorMaster_DTO> AssetSensorMasterDTOs = assetSensorMastersAdminService.getAllAssetSensors();
		return new ResponseEntity<>(AssetSensorMasterDTOs, HttpStatus.OK);
	}

	@GetMapping(value = "/getSelectAssetSensorMasters", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<AssetSensorMaster_DTO>> getSelectAssetSensorMasters(@RequestBody ArrayList<AssetSensorMasterPK> aList) 
	{
		ArrayList<AssetSensorMaster_DTO> AssetSensorMasterDTOs = assetSensorMastersAdminService.getSelectAssetSensors(aList);
		return new ResponseEntity<>(AssetSensorMasterDTOs, HttpStatus.OK);
	}

	@PutMapping("/updAssetSensorMaster")
	public void updateAssetSensorMaster(@RequestBody AssetSensorMaster_DTO AssetSensorMasterDTO) {
		assetSensorMastersAdminService.updAssetSensor(AssetSensorMasterDTO);
		return;
	}

	@DeleteMapping("/delSelectAssetSensorMasters")
	public void deleteSelectAssetSensorMasters(@RequestBody ArrayList<AssetSensorMasterPK> aList) {
		assetSensorMastersAdminService.delSelectAssetSensors(aList);
		return;
	}

	@DeleteMapping("/delAllAssetSensorMasters")
	public void deleteAllAssetSensorMasters() {
		assetSensorMastersAdminService.delAllAssetSensors();
		return;
	}
}
*/