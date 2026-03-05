# Java-practice

A comprehensive Java programming practice repository covering fundamental Java concepts with integrated networking and IP subnetting exercises.

---

## Table of Contents

1. [Assignment 1: Biggest Number & LAN Configuration](#assignment-1)
2. [Assignment 2: Grade Check & IPv4 Addressing](#assignment-2)
3. [Assignment 3: Circle Area & Perimeter & Subnetting](#assignment-3)
4. [Assignment 4: Rectangle Area with Inheritance & IP Routing](#assignment-4)
5. [Assignment 5: Circle Area with Abstract Class & OSPF](#assignment-5)
6. [Assignment 6: Interface & Network Security](#assignment-6)

---

## Assignment 1: Biggest Number & LAN Configuration

### Java Program: Find the Biggest Element Among Three Numbers

**File:** `BiggestNumber.java`

**Objective:** Find the biggest element among three numbers using if-else statements.

**Key Concepts:**

- Conditional statements (if-else)
- Scanner input
- Comparison operators

**Usage:**

```bash
javac BiggestNumber.java
java BiggestNumber
```

**Sample Output:**

```
Enter three numbers:
10
20
15
Biggest number is: 20
```

---

### Networking Task: LAN Setup Configuration

**Objective:** Plan and configure a LAN setup with proper network planning and subnet configuration.

#### a. Planning and Setting IP Networks

- Identify network requirements
- Determine IP address ranges
- Plan subnet structure based on host count

#### b. Configuring Subnet

- Calculate subnet masks
- Assign IP addresses to different network segments
- Configure gateway and DNS settings

#### c. Networking Commands to Execute

Execute the following commands and note the output:

| Command             | Purpose                                      |
| ------------------- | -------------------------------------------- |
| `ping <host>`       | Test connectivity to a host                  |
| `traceroute <host>` | Trace the route to a destination             |
| `netstat`           | Display network statistics and connections   |
| `arp`               | Show ARP (Address Resolution Protocol) table |
| `ipconfig`          | Display IP configuration (Windows)           |
| `getmac`            | Display MAC address of network adapters      |
| `hostname`          | Display the computer's hostname              |
| `nslookup <domain>` | Query DNS for domain information             |
| `pathping <host>`   | Combine ping and traceroute functionality    |
| `systeminfo`        | Display detailed system information          |

---

## Assignment 2: Grade Check & IPv4 Addressing

### Java Program: Grade Check Using Switch Case

**File:** `GradeCheck.java`

**Objective:** Check and display the grade description based on grade input using switch case.

**Key Concepts:**

- Switch case statements
- Character input handling
- String output formatting

**Usage:**

```bash
javac GradeCheck.java
java GradeCheck
```

**Sample Output:**

```
Enter Grade (A/B/C/D): A
Excellent
```

**Grade Mapping:**
| Grade | Description |
|-------|-------------|
| A | Excellent |
| B | Very Good |
| C | Good |
| D | Pass |
| Others | Fail |

---

### Networking Task: IPv4 Addressing and Subnetting

**Objective:** Given an IP address and network mask, determine critical network information.

**Information to Determine:**

- **Network Address:** The first address in the subnet
- **Network Broadcast Address:** The last address in the subnet
- **Total Number of Host Bits:** Bits available for host addresses
- **Number of Hosts:** Total usable host addresses in the subnet

**Example Calculation:**

```
IP Address: 192.168.1.100
Subnet Mask: 255.255.255.0 (/24)

Network Address: 192.168.1.0
Broadcast Address: 192.168.1.255
Number of Host Bits: 8
Number of Hosts: 254 (256 - 2)
```

---

## Assignment 3: Circle Area & Perimeter with Class & Subnetting

### Java Program: Circle Area and Perimeter Calculation

**File:** `Circle.java`

**Objective:** Create a class to calculate the area and perimeter of a circle using object-oriented principles.

**Key Concepts:**

- Class definition
- Constructor
- Object instantiation
- Methods

**Class Structure:**

```
Circle
├── Properties
│   └── radius: double
├── Methods
│   ├── Circle(double r): Constructor
│   ├── area(): double
│   └── perimeter(): double
└── main(): Entry point
```

**Usage:**

```bash
javac Circle.java
java Circle
```

**Sample Output:**

```
Area = 78.5
Perimeter = 31.4
```

---

### Networking Task: Advanced Subnetting Analysis

**Objective:** Analyze a given IP address and network mask to determine subnet information.

**Information to Determine:**

a. **Subnet Address of This Subnet**

- The network address for the given subnet

b. **Broadcast Address of This Subnet**

- The last address in the subnet used for broadcast

c. **Range of Host Addresses for This Subnet**

- The usable IP range (first usable to last usable)

d. **Maximum Number of Subnets for This Subnet Mask**

- Calculate how many subnets can be created with this mask

**Example:**

```
IP: 172.16.0.0/16

Subnet Address: 172.16.0.0
Broadcast Address: 172.16.255.255
Host Range: 172.16.0.1 - 172.16.255.254
Max Subnets with /24: 256
```

---

## Assignment 4: Rectangle Area with Inheritance & IP Routing

### Java Program: Rectangle Area Using Single Inheritance

**File:** `Area.java`

**Objective:** Calculate the area of a rectangle using single inheritance.

**Key Concepts:**

- Single inheritance
- Parent and child classes
- Method overriding

**Class Hierarchy:**

```
Rectangle (Parent)
│
└── Area (Child)
    └── calculate(): void
```

**Usage:**

```bash
javac Area.java
java Area
```

**Sample Output:**

```
Area of Rectangle = 50
```

---

### Networking Task: Configure IP Routing Using RIP

**Objective:** Understand and configure RIP (Routing Information Protocol) for dynamic routing.

**Key Topics:**

- RIP basics and operation
- Distance vector routing
- Metric calculation (hop count)
- RIP configuration on routers
- Convergence and network stability
- RIP v1 vs RIP v2 differences

**Configuration Considerations:**

- Network topology planning
- RIP interface configuration
- Route advertisement
- Passive interfaces
- RIP timers adjustment

---

## Assignment 5: Circle Area with Abstract Class & OSPF

### Java Program: Circle Area and Perimeter Using Abstract Class

**File:** Implementation of circle calculations using abstract class pattern

**Objective:** Calculate circle area and perimeter using abstract class concepts.

**Key Concepts:**

- Abstract classes
- Abstract methods
- Inheritance with abstraction
- Polymorphism

**Design Pattern:**

```
AbstractShape (Abstract Class)
│
├── area(): abstract double
├── perimeter(): abstract double
│
└── Circle (Concrete Implementation)
    ├── area(): double
    └── perimeter(): double
```

---

### Networking Task: Configure Simple and Multi-area OSPF

**Objective:** Implement OSPF routing protocol with single and multiple area configurations.

**Topics Covered:**

**Simple OSPF (Single Area):**

- OSPF fundamentals
- SPF algorithm
- Router ID configuration
- Network statement configuration
- Router interfaces and areas

**Multi-area OSPF:**

- Area types (Backbone, Standard, Stub, Totally Stubby)
- Area Border Router (ABR) configuration
- Autonomous System Boundary Router (ASBR)
- Inter-area routing
- Route summarization

**Configuration Steps:**

- Enable OSPF process
- Configure router ID
- Define networks and areas
- Configure interface costs
- Verify routing table
- Test connectivity between areas

---

## Assignment 6: Interface & Network Security

### Java Program: Circle Area Using Interface

**File:** Implementation using interface pattern

**Objective:** Create an interface for area calculation and implement it for circle area computation.

**Key Concepts:**

- Interface definition
- Interface implementation
- Contract-based programming
- Polymorphism through interfaces

**Interface Design:**

```
interface Area
│
├── calculateArea(): double
│
└── Circle (Implementation)
    └── calculateArea(): double
```

---

### Networking Task: Configure Basic Network Security Features

**Objective:** Implement fundamental security measures for network protection.

**Security Topics:**

#### 1. Access Control Lists (ACLs)

- Standard ACLs
- Extended ACLs
- Named ACLs
- ACL best practices

#### 2. Firewall Configuration

- Packet filtering
- Stateful inspection
- Zone-based firewalls

#### 3. Network Security Protocols

- SSL/TLS encryption
- VPN configuration
- IPSec implementation

#### 4. User Authentication

- AAA (Authentication, Authorization, Accounting)
- User access control
- Password policies

#### 5. Network Monitoring

- Traffic analysis
- Intrusion detection
- Log monitoring

#### 6. Port Security

- MAC address filtering
- Port access control
- VLAN security

---

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Basic understanding of Java programming
- Networking knowledge (IP addressing, subnetting)
- Access to networking tools (ping, traceroute, ipconfig, etc.)

## Compilation and Execution

All Java programs can be compiled and executed using:

```bash
javac <filename>.java
java <classname>
```

## Reference Materials

- Java Documentation: https://docs.oracle.com/en/java/
- Networking Basics
- IP Subnetting Guide
- OSPF and RIP Protocols
- Network Security Best Practices

## Author

Java Practice Repository - Educational Purpose

---

**Last Updated:** March 5, 2026
