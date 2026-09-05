#!/bin/bash

# Variables
IMAGE_NAME="account-service"
VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)
REGISTRY="docker.io/morufoyetechstack"  # e.g., docker.io/username, myregistry.azurecr.io
FULL_IMAGE_NAME="${REGISTRY}/${IMAGE_NAME}:${VERSION}"
LATEST_TAG="${REGISTRY}/${IMAGE_NAME}:latest"

# Build JAR
echo "Building JAR..."
mvn clean package -DskipTests

# Build Docker image
echo "Building Docker image..."
docker build -t ${FULL_IMAGE_NAME} -t ${LATEST_TAG} .

# Tag image
echo "Tagging image..."
docker tag ${FULL_IMAGE_NAME} ${LATEST_TAG}

# Push to registry
echo "Pushing to registry..."
docker push ${FULL_IMAGE_NAME}
docker push ${LATEST_TAG}

echo "Done! Image pushed: ${FULL_IMAGE_NAME}"