package com.example.shrimping_taxi.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

public class MapLocationListener implements LocationListener {

    private MapView mapView;

    public MapLocationListener(MapView map){
        this.mapView = map;
    }

    @Override
    public void onLocationChanged(Location location) {
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord( location.getLatitude(), location.getLongitude()), true);

//        mapView.removeAllPOIItems();
//        MapPOIItem marker = new MapPOIItem();
//        marker.setItemName("Default Marker");
//        marker.setTag(0);
//        marker.setMapPoint(MapPoint.mapPointWithGeoCoord( location.getLatitude(), location.getLongitude()));
//        marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
//        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.

//        mapView.addPOIItem(marker);

        MapPOIItem poiItem = mapView.findPOIItemByTag(0);
        poiItem.setMapPoint(MapPoint.mapPointWithGeoCoord( location.getLatitude(), location.getLongitude()));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
