package com.pavanu.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavanu.organizationservice.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
