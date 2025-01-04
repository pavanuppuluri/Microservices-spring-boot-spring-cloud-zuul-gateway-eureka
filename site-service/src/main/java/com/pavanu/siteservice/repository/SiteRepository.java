package com.pavanu.siteservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavanu.siteservice.model.Site;

/**
 * Site Repository
 * 
 * @author PavanUppuluri
 *
 */
@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

	List<Site> findByOrganizationId(Long organizationId);

}
