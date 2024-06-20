create table if not exists routing_factory_meta(
serializer_code varchar(255) not null,
adapters_meta varchar(255) null,
clearing_sys varchar(255) null,
clearing_template varchar(255) null,
key_part char null,
adapters_system Integer null,
currency_route_exists char null,
routing_name varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint routing_factory_meta_pk primary key(serializer_code));